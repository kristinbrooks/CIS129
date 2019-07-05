/*************************************************************************
  *
  * 
  * Odile wolf 2/15/2016
  * purpose: example showing the need for input validation with a post test loop
  *************************************************************************/

// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class inputValidation1Posttest {
  
  public static void main(String[] args) {
    // first we define our input streams.
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(input);   
    
    // put declarations here
    int myAge;
    // we catch exceptions if some are thrown.
    try {
     
      do {
         System.out.println("Please enter an age between 0 and 150");
         myAge = Integer.parseInt(reader.readLine());
      }while (myAge <0  || myAge >150) ;
      
      System.out.println("Your age is "+ myAge);
      
    } catch (Exception e){
      System.out.println("Error reading from user");
    }
    
  }
  
}


