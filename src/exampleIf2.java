/*************************************************************************
 *Java shell
 * 
 * NOTE: I have put a lot of comments to guide you in the code.
 *************************************************************************/

// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class exampleIf2 {
  
  public static void main(String[] args) {
    // first we define our input streams.
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(input);   
    
    // put declarations here
    int myInt;
    int myAge;
    
    // we catch exceptions if some are thrown.
    try {
      // put code here
      // we need one I/O statement which can throw an exception otherwise we will have an 
      // error. remove after you create a real io statement.
      System.out.println("please enter an integer");
      myInt = Integer.parseInt(reader.readLine());
      
      myAge = 2;
      
      System.out.println("this is my int :"+myInt);
      
      if ( myInt >0) {
        System.out.println(" you entered a positive number :" + (myInt -myAge) +" .");
        System.out.println("you are done");
      } else if (myInt <0)
        System.out.println("you entered a negative number");
      else 
        System.out.println("you entered 0");
      
    } catch (IOException e){
      System.out.println("Error reading from user");
    }
    
  }
  
}


