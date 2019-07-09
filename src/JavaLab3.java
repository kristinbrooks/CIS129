/*************************************************************************
 *  Compilation:  javac JavaLab3.java
 *  Execution:    java JavaLab3
 *  Author: Odile wolf
 *  Date: aug 15th 2014
 *  % java JavaLab3
 * Please enter a number: <5
 * Please enter a number: < 100
 * The total for this run is 105. 
 *  -----------
 * Do you want to play again ? <yes
 * Please enter a number: -5
 * Negative numbers are not allowed. Please enter a positive number: <200
 * The total for this run is 200
 * -----------
 * Do you want to play again ? <yes
 * Please enter a number: <1
 * Please enter a number: <3
 * Please enter a number:<5
 * Please enter a number:<10
 * The total for this run is 19
 * Do you want to play again? <no
 * The highest run was 200.
 * NOTE: I have put a lot of comments to guide you in the code.
 *************************************************************************/

import java.io.*;

public class JavaLab3 {

    public static void main(String[] args) {
      // first we define our input streams.
      InputStreamReader input = new InputStreamReader(System.in);
      BufferedReader reader = new BufferedReader(input);   
      
      // constant declarations
      final Integer MAX = 100; 
      final Integer MAX_NUMBER = 4;
      
      // variable declarations
      String   sName;
      Integer  currentRun;
      Integer  currentNumber;
      Integer  maxRunToDate = 0;
      
      // we catch exceptions if some are thrown.
      // an exception would be entering a string when a number is expected
      try {
            System.out.println("what is your name?");
            
            // we read a string from the stream
            sName = reader.readLine();  
            currentRun = 0;
            
            System.out.println("Please enter a number");
            currentNumber = Integer.parseInt(reader.readLine());
            currentRun = currentRun + currentNumber;
            
            System.out.println("The total for this run is "+ currentRun);
            
      } catch (IOException e){
            System.out.println("Error reading from user");
      }
      
    }

}


