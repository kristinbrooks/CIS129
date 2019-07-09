/*************************************************************************
 *  Compilation:  javac magic.java
 *  Execution:    java magic
 *  author: Odile wolf
 *
 *************************************************************************/
// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class magic {

    public static void main(String[] args) {
      
      final int SIZE = 10;
      final int MAGIC = 10;
      
      int[] myArray = new int[SIZE];
      int index;
      boolean isFound;
      
      // fill the array
      
      InputStreamReader input = new InputStreamReader(System.in);
      BufferedReader reader = new BufferedReader(input);   
          // we catch exceptions if some are thrown.
      try {
        for (index = 0; index <SIZE ; index ++) {
          System.out.println(" please enter the "+(index+1) + "value");
          myArray[index] = Integer.parseInt(reader.readLine());
        }
        
        // try to find the magic number
        isFound = false;
        index = 0;
        while (!isFound && index <SIZE) {
          if (myArray[index] == MAGIC) 
            isFound = true;
          else index ++;
        }
        if (isFound) 
          System.out.println(" the array is MAGIC");
        else 
          System.out.println("this is not your lucky day");
        
      } catch (IOException e){
            System.out.println("Error reading from user");
      }
    }
}


