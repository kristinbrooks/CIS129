import java.util.Scanner;
/**
 * This program checks for input integer error
 */
public class Age_Validation
{
    public static void main(String[] args)
    {
        // capture an input and validate
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");

        // capture input and check for existence condition of an integer
        if (in.hasNextInt())
        {
            // Initiate processing since an integer has been entered.
            int age = in.nextInt();

            // check for boundary and valid input range
            if (age <= 0 || age > 200)
            {
                System.out.println("Error: Age must be between 1 and 200.");
            }
            else
            {
                // Start processing since an integer has been validated
                System.out.println("Your age is "
                        + age);
            }
        }
        else
        {
            System.out.println("Error: Input is not an integer.");
        }
    }
}