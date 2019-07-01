/*************************************************************************
 *Looping
 * 
 * NOTE: I have put a lot of comments to guide you in the code.
 *************************************************************************/

// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class WhileIndefiniteLoop {

    public static void main(String[] args) {
      // first we define our input streams.
      InputStreamReader input = new InputStreamReader(System.in);
      BufferedReader reader = new BufferedReader(input);   
      
      // put declarations here
      int accumulator = 0, currentValue, sentinel;
      
      // we catch exceptions if some are thrown.
      try {
        System.out.println("please enter the sentinel value");
        sentinel= Integer.parseInt(reader.readLine());
        
        //step 1 = initialization of control variable => priming the loop
        System.out.println("please enter an element");
        currentValue = Integer.parseInt(reader.readLine());
        
        //step 2 = test
        while (currentValue != sentinel) {
          
          accumulator = accumulator + currentValue;
          
          //step 3 = preparation for the next iteration
          System.out.println("please enter the next element");
          currentValue = Integer.parseInt(reader.readLine());
        }
        
        
        // at this point we have entered totalIterations values.
        System.out.println("the total number of values that you have entered is "+ accumulator);
        
      } catch (IOException e){
        System.out.println("Error reading from user");
      }
      
    }

}


