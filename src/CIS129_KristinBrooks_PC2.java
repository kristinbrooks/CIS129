/*************************************************************************
 * Kristin Brooks
 * CIS 129
 * Module 2: Pseudocode 2
 * Due 6-16-19
 *
 * This program determines how much money the user needs to be save to accomodate
 * having 5 of their family members visit for fours weeks. It takes into account
 * the regular bills and the fact that the family has 3 teenagers that
 * consume varying amounts of food.
 *************************************************************************/

// this allows us to use classes in all the libraries of java.io
import java.io.*;
// this allows us to use the Random class from the util package
import java.util.Random;

public class CIS129_KristinBrooks_PC2 {

    public static void main(String[] args) {
        // first we define our input streams.
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        // declarations
        // bill related
        final int phoneBill = 150;
        final int waterBill = 60;
        final int entertainmentBill = 20;
        final int electricityBill = 60;
        final int rent = 800;
        int totalBills;
        // food cost related
        final int weeklyFoodCost = 40;
        final int weeks = 4;
        final int adults = 3;
        int week1, week2, week3, week4;
        int adultsMonthlyFoodCost;
        int teensMonthlyFoodCost;


        // calculate the total cost of the monthly house bills
        totalBills = phoneBill + waterBill + entertainmentBill + electricityBill + rent;
        display("Your regular monthly bills are " + totalBills + " dollars.\n");

        // calculate monthly food cost for the adults
        adultsMonthlyFoodCost = adults * weeks * weeklyFoodCost;
        display("The adults’ total estimated monthly grocery costs are " + adultsMonthlyFoodCost +
                    " dollars.\n");

        // week 1 teen food costs
        display("Here are the estimated teenagers’ week 1 grocery costs:");
        week1 = totalWeeklyTeenCost();

        // week 2 teen food costs
        display("Here are the estimated teenagers’ week 2 grocery costs:");
        week2 = totalWeeklyTeenCost();

        // week 3 teen food costs
        display("Here are the estimated teenagers’ week 3 grocery costs:");
        week3 = totalWeeklyTeenCost();

        // week 4 teen food costs
        display("Here are the estimated teenagers’ week 4 grocery costs:");
        week4 = totalWeeklyTeenCost();

        // calculate total monthly teen food costs
        teensMonthlyFoodCost = week1 + week2 + week3 + week4;
        display("The teenagers’ total estimated monthly grocery costs are " + teensMonthlyFoodCost +
                    " dollars\n");

        // calculate total costs for the month
        totalMonthlyCosts(totalBills, adultsMonthlyFoodCost, teensMonthlyFoodCost);

    }

    /****************FUNCTIONS***************/
    // a function to stop from having to type System.outprintln() every time you want to print something
    public static void display(String mydisplay) {
        System.out.println(mydisplay);
    }

    // generates random consumption numbers (multiple of the amount of
    // groceries a regular person eats in one week) for the teenagers
    public static int weeklyTeenConsumption() {
        // create instance of random class
        Random rand = new Random();
        return rand.nextInt(5);
    }

    // takes the consumption number of the person and multiplies it by the cost of groceries for one week
    public static int weeklyTeenCost() {
        int weeklyFoodCost = 40;
        return weeklyTeenConsumption() * weeklyFoodCost;
    }

    // displays the estimated weekly food costs of the individual teenagers
    public static void displayWeeklyTeenCost(int cost1, int cost2, int cost3) {
        display("Teen 1 will consume " + cost1 + " dollars of food, teen 2 will consume " +
                cost2 + " dollars, and teen 3 will consume " + cost3 + " dollars.\n");
    }

    // calculates and displays the weekly total food cost for all 3 teens
    public static int totalWeeklyTeenCost() {
        int teen1, teen2, teen3;
        teen1 = weeklyTeenCost();
        teen2 = weeklyTeenCost();
        teen3 = weeklyTeenCost();
        displayWeeklyTeenCost(teen1, teen2, teen3);
        return teen1 + teen2 + teen3;
    }

    // calculates and displays the total amount of money needed for the month
    public static void totalMonthlyCosts(int bills, int adultFood, int teenFood) {
        int totalCost = bills + adultFood + teenFood;
        display("The estimated total you need to save for your family’s visit is " + totalCost +
                " dollars.");
    }
}