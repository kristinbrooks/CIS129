/*************************************************************************
  *
  * 
  * Odile wolf 2/15/2016
  * purpose//This program will count how many students are between 10 and 18 years old in a summer camp
  *************************************************************************/

// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class AgeAccumutating {
  
  public static void main(String[] args) {
    // first we define our input streams.
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(input);   
    
    // put declarations here
    final String SENTINEL= "quit";
    final int SIZE = 9;
    int [] age = new int[SIZE];
    String currentName;
    int currentAge;
    // we catch exceptions if some are thrown.
    try {
      
      
     // initialize
      for (int i = 0; i<SIZE; i++)
        age[i] = 0;
    
        
      // priming the loop
      System.out.println ("please enter the name of a student, and quit to stop");
      currentName = reader.readLine();
      while (currentName.compareToIgnoreCase( SENTINEL) !=0) {
        System.out.println  ("what is " + currentName +"'s age");
        currentAge = Integer.parseInt(reader.readLine());
        age[currentAge -10] ++;
        
        // update control value to go to the next iteration
        System.out.println ("please enter the name of the next student, and quit to stop");
        currentName = reader.readLine();
      }
      
      // printing the results;
      for (int i = 0; i <SIZE; i++) 
        System.out.println ( "the number of students who are "+ (i+10) + " is " + age[i]);
      
    } catch (Exception e){
        System.out.println("Error reading from user");
      }
      
  }
  
}


