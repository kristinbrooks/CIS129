/*************************************************************************
 *  Kristin Brooks
 *  CIS129
 *  Due Date: 6/30/19
 *
 *  The purpose of this program is to...
 *
 * You will then modify it to accept cookieNames which contain chocolate and/or peanut butter, but don't contain gluten
 * What is the name of the cookieName? Peanut butter jelly thumb
 * Does it contain chocolate? no
 * Does it contain gluten? no
 * Does it contain peanut butter? yes
 * thank you, I love Peanut butter jelly thumb
 * NOTE: I have put a lot of comments to guide you in the code.
 *************************************************************************/

import java.io.*;

public class CIS129_KristinBrooks_Lab2 {

    public static void main(String[] args) {
        // first we define our input streams.
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        // declarations
        String cookieName ;
        String containsChocolate, containsPeanutButter, containsGluten;

        // we catch exceptions if some are thrown.
        try {
            // prompt the user for the cookie's name and read the input
            System.out.println("What is the name of the cookie?");
            cookieName = reader.readLine();

            // prompt the user for the cookie's contents and read the input
            System.out.println("Does it contain chocolate? yes/no");
            containsChocolate = reader.readLine();

            System.out.println("Does it contain gluten? yes/no");
            containsGluten = reader.readLine();

            System.out.println("Does it contain peanut butter? yes/no");
            containsPeanutButter = reader.readLine();

            // determine if it can be eaten or not depending on the contents
            if (containsGluten.compareToIgnoreCase("yes") == 0
                   || (containsChocolate.compareToIgnoreCase("no") == 0
                    && containsPeanutButter.compareToIgnoreCase("no") == 0)) {
                System.out.println("I'm sorry, I can't eat it.");
            } else {
                System.out.println("Thank you, I love " + cookieName + ".");
            }

        } catch (IOException e){
            System.out.println("Error reading from user");
        }

    }

    /**************FUNCTIONS***************/

}


