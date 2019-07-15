/*************************************************************************
 * Kristin Brooks
 * CIS129
 * Module 6: Pseudocode 6
 * Due: 7/14/19
 *
 * The purpose of this program is to grade the multiple choice section
 * of the driver's license exam.
 *************************************************************************/

// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class CIS129_KristinBrooks_PC6 {

    public static void main(String[] args) {
        // we define our input streams.
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        // constants
        final int ARRAY_SIZE = 20;

        // variables
        int numberCorrect = 0; // number of correct answers
        int wrongNumbers = 0; // counter for partial array of wrong answers

        // DECLARE ARRAYS
        // this array holds the correct answers to the exam
        String[] correctAnswers = {"B", "D", "A", "A", "C", "A", "B", "A", "C", "D", "B", "C", "D"
                , "A", "D", "C", "C", "B", "D", "A"};

        // this array will hold the student's answers
        String[] studentAnswers = new String[ARRAY_SIZE];

        // this array will hold the numbers of the problems answered incorrectly
        int[] wrongAnswers = new int[ARRAY_SIZE];

        // we catch exceptions if some are thrown.
        try {
            System.out.println("\nThis program will grade the multiple choice section of the driver's license exam.");

            // input the student's answers
            for (int subscript = 0; subscript < ARRAY_SIZE; subscript++) {
                System.out.println("\nPlease enter the student's answer to question " + (subscript+1) + ":");
                studentAnswers[subscript] = reader.readLine();
            }

            // compare the student's answers to the correct answers, tally correct answers,
            // and record wrong answers
            for (int subscript = 0; subscript < ARRAY_SIZE; subscript++) {
                if (correctAnswers[subscript].compareToIgnoreCase(studentAnswers[subscript]) == 0) {
                    numberCorrect += 1;
                } else {
                    wrongAnswers[wrongNumbers] = subscript + 1;
                    wrongNumbers += 1;
                }
            }

            // grades the exam
            gradeExam(wrongAnswers, numberCorrect, wrongNumbers);

        } catch (IOException e){
            System.out.println("Error reading from user");
        }

    }

    /****************FUNCTIONS*****************/

    // this function determines if the student passed the exam and prints the results
    public static void gradeExam(int[]wrongAnswers, int numberCorrect, int wrongNumbers) {
        int totalQuestions = 20;
        if (numberCorrect >= 15) {
            System.out.println("\nThe student PASSED the multiple choice portion of their exam.");
            System.out.println("They answered " + numberCorrect + " questions correctly. They missed " +
                    (totalQuestions - numberCorrect) + " questions.");
            if (numberCorrect < 20) {
                System.out.println("\nThey missed numbers:");
                for (int subscript = 0; subscript < wrongNumbers; subscript++) {
                    System.out.println(wrongAnswers[subscript]);
                }
            }
        } else {
            System.out.println("\nThe student FAILED the multiple choice portion of their exam.");
            System.out.println("They answered " + numberCorrect + " questions correctly. The missed " +
                    (totalQuestions - numberCorrect) + " questions.");
            System.out.println("\nThey missed numbers:");
            for (int subscript = 0; subscript < wrongNumbers; subscript++) {
                System.out.println(wrongAnswers[subscript]);
            }
        }
    }
}


