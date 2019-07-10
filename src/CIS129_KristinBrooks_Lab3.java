/*************************************************************************
 *  Kristin Brooks
 *  CIS129
 *  Due: 7/14/19
 *
 *  The purpose of this program is to find the highest run of positive
 *  and even numbers higher than 100.
 *************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CIS129_KristinBrooks_Lab3 {

    public static void main(String[] args) {
        // define the input streams.
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        // variable declarations
        String name, answer;
        int currentRun;
        int maxRun = 0;

        // catch exceptions if some are thrown.
        try {
            // get the user's name
            System.out.println("What is your name?");
            name = reader.readLine();

            // introduce the game to the user
            System.out.println("\nWelcome to the game, " + name + "!\n");
            System.out.println("The goal is to find the highest run of positive and even numbers \nhigher than " +
                    "100. The run will end when the sum of the numbers \nreaches 100 or the total " +
                    "number of numbers entered is 5 or greater.");
            System.out.println("\nGood Luck!");

            // this loop will repeatedly run the game until the user says they don't want to continue playing
            do {
                int count = 1;

                currentRun = singleRunTotal(count);

                if (currentRun > maxRun) {
                    maxRun = currentRun;
                }

                System.out.println("Do you want to play again? yes/no");
                answer = reader.readLine();

            } while (answer.compareToIgnoreCase("yes") == 0);

            // give the player their final game results
            System.out.println("\nThank you for playing!\n");
            System.out.println("Your highest run was " + maxRun + ".\n");

        } catch (IOException e){
            System.out.println("Error reading from user");
        }

    }

    /**************FUNCTIONS***************/

    // this function determines if the input is valid or not
    // it is valid if it is a positive, even number
    public static Boolean inputValid(int number) {
        if (number <= 0) {
            System.out.println("\nNegative numbers (and zero) are not allowed. Please enter a positive number:");
            return false;
        } else if (number % 2 != 0) {
            System.out.println("\nOdd numbers are not allowed. Please enter an even number:");
            return false;
        }
        return true;
    }

    // this function plays the user through one run of the game and returns the total for the run
    public static int singleRunTotal(int count) {
        // define the input streams.
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        // constant declarations
        final int MAX = 100;
        final int MAX_NUMBER = 5;

        // variable declarations
        int currentNumber;
        int runTotal = 0;

        // catch exceptions if some are thrown.
        try {
            do {
                System.out.println("\nPlease enter a number:");
                currentNumber = Integer.parseInt(reader.readLine());

                // if the input isn't valid it gets new inputs until a valid one is entered
                while (!inputValid(currentNumber)) {
                    currentNumber = Integer.parseInt(reader.readLine());
                }

                runTotal += currentNumber;
                count += 1;
            } while (runTotal < MAX && count <= MAX_NUMBER);

            System.out.println("\nThe total for this run is " + runTotal + ".\n");
            System.out.println("----------------\n");

        } catch (IOException e) {
            System.out.println("Error reading from user");
        }
    return runTotal;
    }
}


