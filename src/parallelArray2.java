/*************************************************************************
 *  Compilation:  javac parallelArray2.java
 *  Execution:    java parallelArray2
 *  author: Odile wolf
 *
 *************************************************************************/
// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class parallelArray2 {

    public static void main(String[] args) {
      final int SIZE = 4;
      int[] SKU= new int[SIZE];
      Double [] price = new Double [SIZE];
      String[] desc = new String[SIZE];
      
      InputStreamReader input = new InputStreamReader(System.in);
      BufferedReader reader = new BufferedReader(input);   
          // we catch exceptions if some are thrown.
      try {
        for (int i = 0; i<SIZE; i++) {
          System.out.println("please enter the SKU for the element "+ (i+1));
          SKU[i] = Integer.parseInt(reader.readLine());
          System.out.println("please enter its price");
          price[i] = Double.parseDouble(reader.readLine());
          System.out.println("please enter its description");
          desc[i] = reader.readLine();
        }
        printArraysVertical(SKU, price, desc);
      } catch (IOException e){
            System.out.println("Error reading from user");
      }
    }
    ////////////////////// functions
    public static void printArraysVertical(int[]A, Double[]B, String[]C){
       System.out.print(" SKU    :");
       System.out.print(" prices  :");
       System.out.print(" desc  :");
       System.out.println();
      for (int i = 0; i<A.length; i++ ) {
        System.out.printf(" %5d, %2.2f, %5s \n" ,A[i], B[i], C[i]);
      }
    }
}


