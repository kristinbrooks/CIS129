/*************************************************************************
 *  Kristin Brooks
 *  CIS129
 *  Due Date: 6/19/19
 *
 *  The purpose of the program is to determine the age of the parent
 *  when their child was born.
 *************************************************************************/

import java.io.*;

public class CIS129_KristinBrooks_Lab1 {

    public static void main(String[] args) {
        // first we define our input streams.
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        //declarations
        String   sName;
        Integer  parentAge, childAge;

        // we catch exceptions if some are thrown.
        // an exception would be entering a string when a number is expected
        try {
            // ask the mother for her name
            System.out.println("What is your name?");
            // read a string from the stream
            sName = reader.readLine();

            // ask the mother for her age
            System.out.println(sName + ", what is your age?");
            // read a string and transform it to an integer
            parentAge = Integer.parseInt(reader.readLine());

            // ask for the age of her child
            System.out.println("What is your child's age?");
            // read a string and transform it to an integer
            childAge = Integer.parseInt(reader.readLine());

            // display the parent's age when their child was born
            System.out.println("You were " + (parentAge - childAge) + " years old when your child was born.");

        } catch (IOException e){
            System.out.println("Error reading from user");
        }

    }

}
