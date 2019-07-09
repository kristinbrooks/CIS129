/*************************************************************************
  *
  * 
  * Odile wolf 2/15/2016
  * purpose: example showing the need for input validation
  *************************************************************************/

// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class inputValidation1 {
  
  public static void main(String[] args) {
    // first we define our input streams.
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(input);   
    
    // put declarations here
    int myAge;
    // we catch exceptions if some are thrown.
    try {
      System.out.println("Please enter your age");
      myAge = Integer.parseInt(reader.readLine());
      
      System.out.println("Your age is "+ myAge);
      
    } catch (Exception e){
      System.out.println("Error reading from user");
    }
    
  }
  
}


