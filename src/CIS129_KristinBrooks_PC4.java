/*************************************************************************
 * Kristin Brooks
 * CIS129
 * Module 4: Pseudocode 4
 * Due: 6/30/19
 *
 * The purpose of this program is to keep a running total of the user's
 * monthly expenses and tell them if they're over/under budget.
 *************************************************************************/

// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;
// allows money formatting
import java.text.NumberFormat;

public class CIS129_KristinBrooks_PC4 {

    public static void main(String[] args) {
        // first we define our input streams.
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        // create instance of the number formatter
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        // put declarations here
        double total = 0;
        double expense, overUnderBudget;
        int budget;

        // we catch exceptions if some are thrown.
        try {
            // inform the user about the the program and get their monthly budget
            System.out.println("\nThis program will add up your monthly expenses for you and tell you if you" +
                            " are over or under your budget.\n");
            System.out.println("Please enter your monthly budget in dollars.\n");
            budget = Integer.parseInt(reader.readLine());

            // get the user’s first expense
            System.out.println("\nPlease enter your first expense.");
            expense = Double.parseDouble(reader.readLine());

            // get the rest of the user’s expenses and keep a running total
            while (expense != 0) {
                total += expense;
                System.out.println("\nPlease enter your next expense.");
                System.out.println("(or enter 0 if there are no more expenses)");
                expense = Double.parseDouble(reader.readLine());
            }

            // compare the total to the budget and give the user the results
            if (budget > total) {
                overUnderBudget = budget - total;
                System.out.println("\nYou are under budget. You have " + formatter.format(overUnderBudget) +
                        " left.\n");
            } else if (budget == total) {
                System.out.println("\nYou are exactly on budget.\n");
            } else {
                overUnderBudget = total - budget;
                System.out.println("\nYou are over budget by " + formatter.format(overUnderBudget) + ".\n");
            }

        } catch (IOException e){
            System.out.println("Error reading from user");
        }

    }

}