/*************************************************************************
 *  Compilation:  javac ArrayManip.java
 *  Execution:    java ArrayManip
 *  author: Odile wolf
 *
 *************************************************************************/
// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class ArrayManip {

    public static void main(String[] args) {
      InputStreamReader input = new InputStreamReader(System.in);
      BufferedReader reader = new BufferedReader(input); 
      final int SIZE =5;
      int[] elt = new int[SIZE];
      int sum, max, min;
      int counter;
      
        try {
          // fill the array
          for (counter = 0; counter <SIZE; counter ++) {
            System.out.println("please enter a value");
            elt[counter] = Integer.parseInt(reader.readLine());
          }
          sum = elt[0];
          max = elt[0];
          min = elt[0];
          for (counter = 1; counter <SIZE; counter ++) {
            if (max <elt[counter]) max = elt[counter];
            else if (min>elt[counter]) min = elt[counter];
            
            sum = sum + elt[counter];
          }
          System.out.printf("the total is %4d, the average is %3.2f\n the minimum is %3d, and the maximum is %3d\n", sum, (float)(sum /SIZE), min, max);
                            
        } catch (IOException e){
            System.out.println("Error reading from user");
      }
    }
}


