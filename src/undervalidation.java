/*************************************************************************
  *
  * 
  * Odile wolf 10/26/2016
  * purpose: we will show how undervalidation works.
  * Undervalidation happens when something should be validated but it is not.
  * 
  *************************************************************************/

// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class undervalidation {
  
  public static void main(String[] args) {
    // first we define our input streams.
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(input);   
    
    // declaration
    int day, month;
 
    try {
      System.out.println (" welcome to your anniversary planner");
      
      // getting the day  
      System.out.println(" Please enter the day of your anniversary");
      day = Integer.parseInt(reader.readLine());
      while (day <0 || day >31) {
         System.out.println (" A day must be between 1 and 31, please re-enter the day of your anniversary");
         day = Integer.parseInt(reader.readLine());
      }
      
       // getting the month  
      System.out.println(" Please enter the month of your anniversary");
      month = Integer.parseInt(reader.readLine());
      while (month <0 || month >12) {
         System.out.println (" A month must be between 1 and 12, please re-enter the month of your anniversary");
         month = Integer.parseInt(reader.readLine());
      }
         
      System.out.println("You are set to go. We will be looking for venues for " + day +"/"+ month);
      
    } catch (Exception e){
      System.out.println("Error reading from user");
    }
    
  }
  
}


