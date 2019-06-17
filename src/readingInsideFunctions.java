/*************************************************************************
 *Java shell
 * 
 * NOTE: I have put a lot of comments to guide you in the code.
 *************************************************************************/

// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class readingInsideFunctions {
  
  public static void main(String[] args) {
    
    
    // put declarations here
    int myAge = getMyAge();
    
    System.out.println("you entered " + myAge);
    
  }
  //////////////////////////////// functions
  static public int getMyAge(){
    
    int age = 0;
    // first we define our input streams.
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(input);   
    // we catch exceptions if some are thrown.
    try {
      System.out.println("what is your age?");
      age = Integer.parseInt(reader.readLine()); 
    } catch (IOException e){
      System.out.println("Error reading from user");
    }
    return age;
  }
}


