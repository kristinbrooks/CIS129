/*************************************************************************
 *Java shell
 * 
 * NOTE: I have put a lot of comments to guide you in the code.
 *************************************************************************/

// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;
import java.util.Random;
public class randomExample {
  
  public static void main(String[] args) {
    
    Random rand = new Random();
    // put declarations here
    int myAge = getMyAge(rand);
    
    System.out.println("you are " + myAge + " years old");
    
  }
  //////////////////////////////// functions
  static public int getMyAge(Random rand){
    
    int age = rand.nextInt(100); // will give me a number between 1 and 100.
  
    return age;
  }
}


