/*************************************************************************
 * Kristin Brooks
 * CIS 129
 * Mod 1: Pseudocode 1 Assignment
 *
 * Stovetop Frittata Recipe (Servings: 2)
 *************************************************************************/

// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

// This program gets the number of servings needed by the user, adjusts
// the recipe quantities, and prints it out with instructions for the user.
public class CIS129_KristinBrooks_PC1 {
    public static void main(String[] args) {
        // first we define our input streams.
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        // constants
        final int EGGS = 2;
        final int HAM = 56;
        final int CHEESE = 28;
        final int ONION = 40;
        final double BELLPEPPER = 45;
        final double PEPPER = 5;
        final int SALT = 10;
        final int PEOPLE = 2;

        // variables
        int eggs, hamGrams, cheeseGrams, onionGrams, saltGrams, actualPeople;
        double bellpepperGrams, pepperGrams;

        // we catch exceptions if some are thrown.
        try {
            // get input from the user
            System.out.println("This is a recipe for Stovetop Frittata. The base recipe is" +
                    "for 2 people. How many people do you need to feed today?");
            actualPeople = Integer.parseInt(reader.readLine());

            // calculations for ingredient quantities
            eggs = EGGS / PEOPLE * actualPeople;
            hamGrams = HAM / PEOPLE * actualPeople;
            cheeseGrams = CHEESE / PEOPLE * actualPeople;
            onionGrams = ONION / PEOPLE * actualPeople;
            bellpepperGrams = BELLPEPPER / PEOPLE * actualPeople;
            pepperGrams = PEPPER / PEOPLE * actualPeople;
            saltGrams = SALT / PEOPLE * actualPeople;

            // print a list of the recipe ingredients
            System.out.println("Here is your Stovetop Frittata recipe for " + actualPeople + " people.");
            System.out.println();
            System.out.println("Ingredients:");
            System.out.println(eggs + " Eggs");
            System.out.println(hamGrams + " grams Ham");
            System.out.println(cheeseGrams + " grams Cheese");
            System.out.println(onionGrams + " grams Onion");
            System.out.println(bellpepperGrams + " grams Bell Pepper");
            System.out.println(pepperGrams + " grams Pepper");
            System.out.println(saltGrams + " grams Salt");
            System.out.println();

            // print the recipe instructions
            System.out.println("STEP 1: Chop the onions and bell peppers. They can be fine or " +
                    "chunky depending on your personal preference.");
            System.out.println();
            System.out.println("STEP 2: Put an appropriately sized frying pan on the stove on medium " +
                    "heat. If it isn’t a nonstick pan oil the pan so the Frittata doesn’t stick. Add the " +
                    "onions and bell peppers to the pan and season with half the salt and pepper.");
            System.out.println();
            System.out.println("STEP 3: Grate the cheese. Cube the ham into ¼ - ½ inch cubes. ");
            System.out.println();
            System.out.println("STEP 4: Crack the eggs into a bowl and whisk with a splash of water until " +
                    "evenly mixed. The splash of water will make the eggs fluffier.");
            System.out.println();
            System.out.println("STEP 5: When the onions start to caramelize add the eggs and ham to the " +
                    "pan. Mix everything together. Sprinkle on the the remaining salt and pepper and add half" +
                    " the cheese. Mix again and spread the mixture evenly in the pan");
            System.out.println();
            System.out.println("STEP 6: Keep an eye on the cooking mixture. When the eggs start to puff up " +
                    "and become opaque, sprinkle the other half of the cheese over the top. Continue to cook " +
                    "until only the center wiggles a little bit when you jiggle the pan. This should take about " +
                    "20 minutes. Then remove the pan from the burner.");
            System.out.println();
            System.out.println("Step 7: Your Stovetop Frittata is done! Cut into " + actualPeople +
                    " servings, add and sides and garnishes you desire, and serve up the meal!");

        } catch (IOException e){
            System.out.println("Error reading from user");
        }

    }

}