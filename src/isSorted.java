/*************************************************************************
 *  Compilation:  javac isSorted.java
 *  Execution:    java isSorted
 *  author: Odile wolf
 *
 *************************************************************************/
// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class isSorted {

    public static void main(String[] args) {
      // declaration
      final int SIZE = 5;
      int[] A = new int[SIZE];
      
      fillArray(A);
      
      if (isSortedArray(A)) 
            System.out.println("the array is sorted");
      else System.out.println("the array is not sorted");
      
     
    }
    ///////////////functions
    public static void fillArray(int[] B){
      InputStreamReader input = new InputStreamReader(System.in);
      BufferedReader reader = new BufferedReader(input);   
      // we catch exceptions if some are thrown.
      try {
        
        for (int i = 0; i<B.length; i++) {
          System.out.println("please enter a value for element "+ (i+1));
          B[i] = Integer.parseInt(reader.readLine());
        }
       
      } catch (IOException e){
        System.out.println("Error reading from user");
      }
    }
    public static boolean isSortedArray(int[] B){
      boolean isSorted = true;
      int index = 0;
      while (isSorted && index < (B.length -1)) {
        if (B[index+1] <B[index]) 
          isSorted = false;
        else 
          index ++;
      }
      return isSorted;
    }
}


