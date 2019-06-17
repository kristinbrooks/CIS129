/*************************************************************************
 *Java shell
 * 
 * NOTE: I have put a lot of comments to guide you in the code.
 *************************************************************************/

// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class compoundNot {

    public static void main(String[] args) {
      // first we define our input streams.
      InputStreamReader input = new InputStreamReader(System.in);
      BufferedReader reader = new BufferedReader(input);   
      
      // put declarations here
      int firstVal, secondVal, thirdVal;
      
      // we catch exceptions if some are thrown.
      try {
        System.out.println("please enter the first value");
        firstVal = Integer.parseInt(reader.readLine()); 
        
        System.out.println("please enter the second value");
        secondVal = Integer.parseInt(reader.readLine()); 
        
        System.out.println("please enter the third value");
        thirdVal = Integer.parseInt(reader.readLine()); 
        
        /**************** TRUTH TABLE **************
          * condition 1 = firstVal == 1
          * condition 2 = secondVal == 1
          * condition 3 = thirdVal == 1
          *              
          *  condition1    condition2   condition3     !( C1 or C2 or C3)  (!C1 AND !C2 AND !C3)
          *  T             T            t                 F                     F
          *  T             T            F                 f                     F
          *  T             F            T                 f                     F
          *  T             F            F                 f                     F                  
          *  F             T            t                 f                     F
          *  F             T            F                 F                     F
          *  F             F            T                 F                     F
          *  F             F            F                 T                     T
          * 
          *  
          * ********************************************/
        
        System.out.println("C1: " + (firstVal == 1) +" C2: "+ (secondVal == 1) + "C3 :" + (thirdVal ==1));
        System.out.println("!(C1 OR C2 OR C3)" + !(firstVal == 1 || secondVal == 1 || thirdVal == 1));
        System.out.println("!C1 AND !C2 AND !C3" + (firstVal != 1 && secondVal != 1 && thirdVal != 1));
   
      } catch (IOException e){
            System.out.println("Error reading from user");
       }
      
    }

}


