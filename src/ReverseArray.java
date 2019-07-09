/*************************************************************************
 *  Compilation:  javac ReverseArray.java
 *  Execution:    java ReverseArray
 *  author: Odile wolf
 *
 *************************************************************************/
// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class ReverseArray {

    public static void main(String[] args) {
      final int SIZE =10;
      int[] A = new int[SIZE];
      
      InputStreamReader input = new InputStreamReader(System.in);
      BufferedReader reader = new BufferedReader(input);   
          // we catch exceptions if some are thrown.
      try {
        // fill the array
        for (int i = 0; i<SIZE; i++) {
          System.out.println("please enter the new element");
          A[i] = Integer.parseInt(reader.readLine());
        }
        printArray(A);
        printReverseArray(A);
      } catch (IOException e){
            System.out.println("Error reading from user");
      }
    }
    /////////////// functions
    public static void printArray(int[] B){
      for (int i = 0; i<B.length; i++ ) {
        System.out.print(B[i] + "  ");
      }
      System.out.println();
    }
    public static void printReverseArray(int[]C) {
      for (int i = C.length -1; i>=0; i --) {
        System.out.print(C[i] + "  ");
      }
      System.out.println();
      
    }
}


