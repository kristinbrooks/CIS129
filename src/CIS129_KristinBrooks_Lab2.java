/*************************************************************************
 *  Kristin Brooks
 *  CIS129
 *  Due Date: 6/30/19
 *
 *  The purpose of this program is to determine if a cookie will be eaten
 *  based on whether it contains chocolate, gluten, or peanut butter.
 *  Cookies will be eaten if they contain chocolate and/or peanut butter,
 *  but not gluten.
 *************************************************************************/

import java.io.*;

public class CIS129_KristinBrooks_Lab2 {

    public static void main(String[] args) {
        // first we define our input streams.
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        // declarations
        String cookieName ;
        String chocolateInput, peanutButterInput, glutenInput;

        // we catch exceptions if some are thrown.
        try {
            // prompt the user for the cookie's name and read the input
            System.out.println("What is the name of the cookie?");
            cookieName = reader.readLine();

            // prompt the user for the cookie's contents and read the inputs
            // test to make sure the input is valid (yes or no)
            System.out.println("Does it contain chocolate? yes/no");
            chocolateInput = reader.readLine();
            validInput(chocolateInput);

            System.out.println("Does it contain gluten? yes/no");
            glutenInput = reader.readLine();
            validInput(glutenInput);

            System.out.println("Does it contain peanut butter? yes/no");
            peanutButterInput = reader.readLine();
            validInput(peanutButterInput);

            // determine if it can be eaten or not depending on the contents
            if (cannotEat(chocolateInput, peanutButterInput, glutenInput)) {
                System.out.println("I'm sorry, I can't eat it.");
            } else {
                System.out.println("Thank you, I love " + cookieName + ".");
            }

        } catch (IOException e){
            System.out.println("Error reading from user");
        }

    }

    /**************FUNCTIONS***************/

    // tells the user their input was invalid and exits the program if they didn't answer with yes or no
    public static void validInput(String contentsAnswer) {
        if (!(contentsAnswer.compareToIgnoreCase("yes") == 0 || contentsAnswer.compareToIgnoreCase("no") == 0)) {
            System.out.println("That is not a valid input. Please start over.");
            System.exit(0);
        }
    }

    // determines if they entered something that makes them unable to eat the cookie
    private static boolean cannotEat(String chocolateInput, String peanutButterInput, String glutenInput) {
        if (glutenInput.compareToIgnoreCase("yes") == 0) {
            // guard clause
            return true;
        }
        return chocolateInput.compareToIgnoreCase("no") == 0
                && peanutButterInput.compareToIgnoreCase("no") == 0;
    }

}


