/*************************************************************************
 * Kristin Brooks
 * CIS129
 * Due Date: 6/23/19
 *
 * This program determines if an airline passenger is
 * eligible for a 20% discount.
 *************************************************************************/

import javax.swing.*;

public class CIS129_KristinBrooks_Lab2 {
    public static void main(String args[])
    {
        String passengerName = ""; 	// Passenger's name.
        String ageString = "";    // String version of passenger's age.
        int passengerAge = 0; 	// Passenger's age.

        // This is the work done in the housekeeping() method
        passengerName = JOptionPane.showInputDialog("Enter passenger's name: ");
        ageString = JOptionPane.showInputDialog("Enter passenger's age: ");

        passengerAge = Integer.parseInt(ageString);

        // Check for input errors. For example, check for negative age condition.
        if (passengerAge < 0) {
            System.out.println("ERROR. " + passengerAge + " is an invalid age. Please start over.");
            System.exit(0);
        }

        // Test to see if this customer is eligible for a 20% discount.
        if (passengerAge <= 7 || passengerAge >= 65) {
            System.out.println(passengerName + " is eligible for a 20% discount.");
        } else {
            System.out.println(passengerName + " is not eligible for a discount.");
        }

        System.exit(0);
    }

}

