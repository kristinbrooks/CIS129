/*************************************************************************
 *  Compilation:  javac SumArrayWFunctions.java
 *  Execution:    java SumArrayWFunctions
 *  author: Odile wolf
 *
 *************************************************************************/
// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class SumArrayWFunctions {

    public static void main(String[] args) {
      final int SIZE = 10;
      int[] A = new int[SIZE];
      
      fillArray(A);
      printArray(A);
      printSumArray(A);
      
      
     
    }
    //////////////////functions
    
    public static void printArray(int[]B) {
      int index;
      for (index = 0; index <B.length; index ++) {
        System.out.print( B[index] + " ");
      }
      System.out.println();
    }
    
    public static void printSumArray(int[] B) {
      int sum = 0;
      int index;
      for(index = 0; index <B.length; index ++)
        sum = sum + B[index];
      System.out.println("the sum of all elements is "+ sum);
    }
    
    public static void fillArray(int[] B) {
      int index;
      InputStreamReader input = new InputStreamReader(System.in);
      BufferedReader reader = new BufferedReader(input);   
          // we catch exceptions if some are thrown.
      try {
        for (index = 0; index < B.length; index ++) {
          System.out.println("please enter an element");
          B[index] = Integer.parseInt(reader.readLine());
        }
          
      } catch (IOException e){
            System.out.println("Error reading from user");
      }
    }
}


