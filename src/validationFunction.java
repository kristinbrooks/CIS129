/*************************************************************************
  *
  * 
  * Odile wolf 10/26/2016
  * purpose: we will show how undervalidation works.
  * Validation functions.
  * 
  *************************************************************************/

// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class validationFunction {
  
  public static void main(String[] args) {
    
    // declaration
    int actualSpeed;
    int speedLimit; 
    
    // getting the speed limit
    speedLimit = getSpeedLimit (" the speed limit");
    
    // getting the actual speed limit
    actualSpeed = getSpeedLimit (" your actual speed");
    
    
    if (actualSpeed > (speedLimit + 10)) {
      System.out.println(" you will get stopped by the police");
    }
     
  }
  
  
  static public int getSpeedLimit(String whatSpeed){
    int speed = 0; 
     // first we define our input streams.
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(input);   
    
    try {
      System.out.println(" please enter "+ whatSpeed);
      speed = Integer.parseInt(reader.readLine());
      while (speed <0 || speed >100) {
            System.out.println(" please enter"+ whatSpeed +" which is positive and less than 100");
            speed = Integer.parseInt(reader.readLine());
      }
    } catch (Exception e){
      System.out.println("Error reading from user");
    }
    return speed;
  }
}


