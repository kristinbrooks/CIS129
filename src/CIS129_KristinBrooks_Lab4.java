/****************************************************************
 * Kristin Brooks
 * CIS129
 * Lab4
 * Due: 7/28/19
 *
 * The purpose of this program is to print out monthly rental
 * slips for the renters of 5 different apartments. The slips
 * will list the renter's name, their apartment number, the
 * month and day rent is due, and when they will be charged a
 * late fee.
 ***************************************************************/
import java.io.*;

public class CIS129_KristinBrooks_Lab4 {
    public static void main(String[] args) {
        // define input streams
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        // constant
        final int NUM_APARTMENTS = 5;

        // arrays
        String[] apartments = {"Apt 1", "Apt 2", "Apt 3", "Apt 4", "Apt 5"};
        String[] renterNames = new String[NUM_APARTMENTS];

        try {
            // loop through each apartment getting the renter's name and printing their rental slips
            for (int subscript = 0; subscript < NUM_APARTMENTS; subscript++) {
                System.out.println("\nPlease enter the name of the renter of " + apartments[subscript] + ":");
                renterNames[subscript] = reader.readLine();

                // if input is empty make user re-enter
                while (renterNames[subscript].isEmpty()) {
                    System.out.println("Name cannot be left blank. Please enter a name:");
                    renterNames[subscript] = reader.readLine();
                }

                printRentSlips(apartments, renterNames, subscript);
            }

        } catch (IOException e) {
            System.out.println("Error reading from user");
        }

    }

    /********************FUNCTIONS**********************/
    // this function prints out the monthly rental slips to be given to the renters
    public static void printRentSlips(String[] apartment, String[] names, int numApartment) {
        // local constant
        final int NUM_MONTHS = 12;

        // local arrays
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};
        String[] rents = {"$300.00", "$400.00", "$250.00", "$500.00", "$1000.00"};

        // loop through the months to print the slips for the given apartment, one per month
        for (int subscript = 0; subscript < NUM_MONTHS; subscript++) {
            System.out.println("\n---------------------------------------------------------");
            System.out.println("\n" + names[numApartment] + ", " + apartment[numApartment] + " " + months[subscript] +
                    " rent due: " + rents[numApartment] + " on " + months[subscript] + " 1st.");
            System.out.println("\nLate fees will be collected on " + months[subscript] + " 5th.");

        }
        System.out.println("\n---------------------------------------------------------");

    }

}