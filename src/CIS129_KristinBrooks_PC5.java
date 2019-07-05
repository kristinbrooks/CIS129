/*************************************************************************
 * Kristin Brooks
 * CIS129
 * Module 5: Pseudocode 5
 * Due: 7/7/19
 *
 * The purpose of this program is to calculate an employee's gross pay.
 *************************************************************************/

// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;
// allows currency formatting
import java.text.NumberFormat;

public class CIS129_KristinBrooks_PC5 {

    public static void main(String[] args) {
        // first we define our input streams.
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        // create instance of the number formatter
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        // put declarations here
        double payRate, hoursWorked, grossPay;

        // we catch exceptions if some are thrown.
        try {
            // ask user for the pay rate
            System.out.println("\nPlease enter the employee's hourly pay rate.");
            payRate = Double.parseDouble(reader.readLine());

            while (payRate < 7.5 || payRate > 18.25) {
                System.out.println("\nERROR. Invalid pay rate. Please enter an hourly rate between $7.50 " +
                        "and $18.25.");
                payRate = Double.parseDouble(reader.readLine());
            }

            do {
                System.out.println("\nPlease enter the number of hours between 0 and 40 that the " +
                        "employee worked for the week.");
                hoursWorked = Double.parseDouble(reader.readLine());
            } while (hoursWorked < 0 || hoursWorked > 40);

            grossPay = payRate * hoursWorked;
            System.out.println("\nThe employee's weekly gross pay is " + formatter.format(grossPay) + ".\n");

        } catch (IOException e){
            System.out.println("Error reading from user");
        }

    }

}

