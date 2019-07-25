/*******************************************************************
 * Kristin Brooks
 * CIS129
 * Module 8: Pseudocode 8
 * Due: 7/28/19
 *
 * This program gets golf scores from user, sorts them into
 * ascending order, and lets them search for scores if they want.
 ******************************************************************/

import java.io.*;

public class CIS129_KristinBrooks_PC8 {

    public static void main(String[] args) {
        // define input streams
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        // declarations
        final int ARRAY_SIZE = 10;
        String answer;

        // arrays
        int[] golfScores = new int[ARRAY_SIZE];
        int[] sortedScores;

        try {
            // introduction for user
            System.out.println("\nThis program will take your golf scores, sort them, and allow you to search " +
                    "for particular scores if you want.\n");

            // get the golf scores from the user
            for (int subscript = 0; subscript < ARRAY_SIZE; subscript++) {
                System.out.println("Please enter golf score number " + (subscript + 1) + ":");
                golfScores[subscript] = Integer.parseInt(reader.readLine());
                while (golfScores[subscript] < 0) {
                    System.out.println("Scores cannot be negative. Please enter a new score:");
                    golfScores[subscript] = Integer.parseInt(reader.readLine());
                }
            }

            // sort the array in ascending order
            sortedScores = sortGolfScores(golfScores, ARRAY_SIZE);

            // print out the sorted array
            System.out.println("\nHere are your golf scores in ascending order:");
            for (int subscript = 0; subscript < ARRAY_SIZE; subscript++) {
                System.out.println((subscript + 1) + ". " + sortedScores[subscript]);
            }

            // find out if they would like to search for a score
            System.out.println("\nWould you like to search for a golf score? (yes/no)");
            answer = reader.readLine();

            // check if answered yes/no. if didn't enter yes/no, get valid input
            answer = validInput(answer);

            // if answered yes to search, search for score and ask if want to search again
            searchScores(answer, golfScores, ARRAY_SIZE);

        } catch (IOException e){
            System.out.println("Error reading from user");
        }

    }

    /******************FUNCTIONS********************/
    // this function sorts the golf scores into ascending order
    public static int[] sortGolfScores(int array[], int arraySize) {
        // local declarations
        int startScan, minIndex, minValue, index;

        for (startScan = 0; startScan <= (arraySize - 2); startScan++) {
            minIndex = startScan;
            minValue = array[startScan];
            for (index = startScan + 1; index <= (arraySize - 1); index++) {
                if (array[index] < minValue) {
                    minValue = array[index];
                    minIndex = index;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[startScan];
            array[startScan] = temp;
        }
        return array;
    }

    // this function searches the array for the value the user wants to find
    public static int searchScoreArray(int array[], int searchValue, int arraySize) {
        // local declarations
        int first = 0; // subscript of first element
        int last = arraySize - 1; // subscript of last element
        int position = -1; // position of search value
        boolean found = false; // flag
        int midpoint;

        while (!found && (first <= last)) {
            midpoint = (first + last) / 2;
            if (array[midpoint] == searchValue) {
                found = true;
                position = midpoint;
            } else if (array[midpoint] > searchValue) {
                last = midpoint -1;
            } else {
                first = midpoint + 1;
            }
        }
        return position;
    }

    // this function makes sure user entered yes or no and gets valid input if they didn't
    public static String validInput(String answer) {
        // define input streams
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        try {
            while (!(answer.compareToIgnoreCase("yes") == 0) && !(answer.compareToIgnoreCase("y") == 0) &&
                    !(answer.compareToIgnoreCase("no") == 0) && !(answer.compareToIgnoreCase("n") == 0)) {
                System.out.println("\nNot a valid answer. Please enter yes or no:");
                answer = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error reading from user");
        }
        return answer;
    }

    // this function finds out what score the user wants to find, searches for it, and
    // tells them if/where it was found
    public static void searchScores(String answer, int golfScores[], int ARRAY_SIZE) {
        // define input streams
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        // local declarations
        int score, scoreLocation;

        try {
            while ((answer.compareToIgnoreCase("yes") == 0) || (answer.compareToIgnoreCase("y") == 0)) {
                System.out.println("\nWhat score would you like to search for?");
                score = Integer.parseInt(reader.readLine());
                scoreLocation = searchScoreArray(golfScores, score, ARRAY_SIZE);
                if (scoreLocation != -1) {
                    System.out.println("\n" + score + " was located. It is number " + (scoreLocation + 1) +
                            " on the list of golf scores.");
                } else {
                    System.out.println("\n" + score + " could not be located on the score list.");

                }
                System.out.println("\nWould you like to search for another score? (yes/no)");
                answer = reader.readLine();
                // check answer for valid input and get new input if not valid
                answer = validInput(answer);
            }
        } catch (IOException e) {
            System.out.println("Error reading from user");
        }

    }

}