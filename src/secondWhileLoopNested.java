/*************************************************************************
 *Looping
 * 
 * NOTE: I have put a lot of comments to guide you in the code.
 *************************************************************************/

// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class secondWhileLoopNested {

    public static void main(String[] args) {
      // first we define our input streams.
      InputStreamReader input = new InputStreamReader(System.in);
      BufferedReader reader = new BufferedReader(input);   
      
      // put declarations here
      int i, j, numberOfKids, totalIterations;
      String currentName;
      int oldestChild, currentAge;
      
      // we catch exceptions if some are thrown.
      try {
        System.out.println("please enter the total number of employees you have");
        totalIterations= Integer.parseInt(reader.readLine());
        
        //step 1 = initialization of control variable
        i = 0;/*step1*/
       
        //step 2 = test
        while (i <totalIterations/*step2*/) {
          
          System.out.println("Employee:"+ (i+1));
          System.out.println("What is your name: ");
          currentName = reader.readLine();
          System.out.println(currentName +", how many children do you have?");
          numberOfKids  = Integer.parseInt(reader.readLine());
          oldestChild =0; // I am assuming that there wouldn't be any negatives
          
          j = 0 /*step1*/;
          while( j <numberOfKids /*step2*/  ){
            System.out.println(currentName + ", what is the age of your "+(j+1) + "child");
            currentAge = Integer.parseInt(reader.readLine());
            if(currentAge >oldestChild) 
              oldestChild = currentAge;
            j++; /* step3*/
          }
          if (oldestChild == 0) System.out.println(currentName + ", you don't have any children.");
          else System.out.println(currentName + ", your oldest child is " + oldestChild);
          
          //step 3 = preparation for the next iteration
          i++;/*step3*/ 
        }
        
      } catch (IOException e){
        System.out.println("Error reading from user");
      }
      
    }
    
}


