/*************************************************************************
 * Kristin Brooks
 * CIS 129
 * Module 3: Pseudocode 3
 * Due 6-23-19
 *
 * This program will get the necessary information from the client about
 * their paint job, calculate the costs, and print them a bill.
 *************************************************************************/

// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;
import java.text.NumberFormat;

public class CIS129_KristinBrooks_PC3 {

    public static void main(String[] args) {
        // first we define our input streams.
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        // create instance of the number formatter
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        //constants
        String companyName = "Custom Paintings\n123 Main St\nTucson,AZ 85701\n";
        int windowHeight = 2;
        int windowWidth = 3;
        int fauxPremium = 200;
        int trimPremium = 40;
        double trimHeight = 0.5;

        //variables
        String customerName, lengthString, widthString, heightString, trimColor, fauxFinish, numString;
        int roomLength, roomWidth, ceilingHeight, windowSqFt, numColors;
        double wallSqFt, totalSqFt;
        double baseCost, baseLabor, baseTotal, baseGallons;
        double trimSqFt, trimGallons;
        double trimCost = 0;
        double fauxCost, fauxLabor, fauxSqFt, fauxGallons;
        double fauxTotal = 0;
        double totalCost;

        // we catch exceptions if some are thrown.
        try {
            // get customer’s name
            display("What is the customer’s name?");
            customerName = reader.readLine();

            // get the room dimensions
            display("What is the length of the room in feet?");
            lengthString = reader.readLine();
            display("What is the width of the room in feet?");
            widthString = reader.readLine();
            display("What is the height of the ceiling in feet?");
            heightString = reader.readLine();

            // change the dimension strings to integers
            roomLength = Integer.parseInt(lengthString);
            roomWidth = Integer.parseInt(widthString);
            ceilingHeight = Integer.parseInt(heightString);

            // calculate sqft of the room’s walls
            wallSqFt = findArea(roomLength, roomWidth, ceilingHeight);
            windowSqFt = windowHeight * windowWidth;
            totalSqFt = wallSqFt - windowSqFt;

            // calculate number of gallons and the cost of the base coat
            baseGallons = neededGallons(totalSqFt);
            baseCost = cost(baseGallons);
            baseLabor = laborCost(totalSqFt);
            baseTotal = baseCost + baseLabor;

            // find out if they want a different color for the trim
            display("Do you want a different color for the trim?");
            trimColor = reader.readLine();
            trimColor = trimColor.toLowerCase();

            // if they want a different trim color, calculate the sqft, gallons, and cost
            if (trimColor.equals("yes")) {
                trimSqFt = findArea(roomLength, roomWidth, trimHeight);
                trimGallons = neededGallons(trimSqFt);
                // adjust gallons needed for base coat
                totalSqFt = totalSqFt - trimSqFt;
                baseGallons = neededGallons(totalSqFt);
                // adjust costs
                baseCost = cost(baseGallons);
                baseTotal = baseCost + baseLabor;
                trimCost = cost(trimGallons) + trimPremium;
            }

            // find out if they want a faux finish
            display("Do you want a faux finish?");
            fauxFinish = reader.readLine();
            fauxFinish = fauxFinish.toLowerCase();

            // if they do, find out how many colors, and calculate gallons & cost
            if (fauxFinish.equals("yes")) {
                display("How many colors would you like in your faux finish ?");
                numString = reader.readLine();
                //change numColors to int
                numColors = Integer.parseInt(numString);
                fauxSqFt = totalSqFt / numColors;
                fauxGallons = neededGallons(fauxSqFt) * numColors;
                fauxCost = cost(fauxGallons);
                fauxLabor = baseLabor + fauxPremium;
                fauxTotal = fauxCost + fauxLabor;
            }

            // total costs
            totalCost = baseTotal + trimCost + fauxTotal;

            // print invoice
            display("\nThank you. Here is your bill.\n");
            display(companyName);
            display("Customer name: " + customerName);
            display("\n\n\nThe surface to be painted is " + (int)totalSqFt + " sq ft.");
            display("\nBase Coat:       " + formatter.format(baseTotal));
            if (trimColor.equals("yes")) {
                display("\nTrim:        " + formatter.format(trimCost));
            }
            if (fauxFinish.equals("yes")) {
                display("\nFaux Finish:     " + formatter.format(fauxTotal));
            }
            display("\n----------------------------------------------------\n");
            display("Total:	    " + formatter.format(totalCost));

        } catch (IOException e){
            System.out.println("Error reading from user");
        }

    }

    /**************FUNCTIONS***************/

    // a function to stop from having to type System.out.println() every time you want to print something
    public static void display(String mydisplay) {
        System.out.println(mydisplay);
    }

    // find sqft of area to be painted
    public static double findArea(int length, int width, double height) {
        // opposite walls have the same dimensions, so there are two of each set of dimensions
        int numWalls = 2;
        double area = (length * height * numWalls) + (width * height * numWalls);
        return area;
    }

    // find cost of paint
    public static double cost(double gallons) {
        int gallonCost = 20;
        return gallons * gallonCost;
    }

    // figure out how many gallons are needed
    public static double neededGallons(double sqFt) {
        int sqFtPerGallon = 400;
        double gallons = sqFt / sqFtPerGallon;
        return Math.ceil(gallons);
    }

    // calculate labor costs
    public static double laborCost(double sqFt) {
        double laborPerSqFt = 0.75;
        double cost = sqFt * laborPerSqFt;
        return Math.ceil(cost);
    }

}
