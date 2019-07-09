/*************************************************************************
 *  Compilation:  javac ArrayAvg.java
 *  Execution:    java ArrayAvg
 *  author: Odile wolf
 *  date 4-8
 * purpose: entering values and computing average
 *************************************************************************/
// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class ArrayAvg {

    public static void main(String[] args) {

      // constants
      final int SIZE = 5;
      Double [] scores = new Double[SIZE];
      Double sum = 0.0;
      // entering the values
   
      InputStreamReader input = new InputStreamReader(System.in);
      BufferedReader reader = new BufferedReader(input);   
          // we catch exceptions if some are thrown.
      try {
         for (int i  = 0; i<SIZE ; i++) {
           System.out.println("please enter the "+(i+1)+ " value");
           scores[i] = Double.parseDouble(reader.readLine());
         }
         // accumulate the values
         
         for (int i = 0; i<SIZE; i++) {
           sum = sum + scores[i];
         }
         System.out.printf("the average of all these values is %3.2f",(sum/SIZE));
      } catch (IOException e){
            System.out.println("Error reading from user");
      }
    }
}


