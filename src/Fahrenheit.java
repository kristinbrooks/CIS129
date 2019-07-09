/*************************************************************************
 *  Compilation:  javac Fahrenheit.java
 *  Execution:    java Fahrenheit
 *  author: Odile wolf
 *  purpose is to have // arrays and find a temp in fahr in one, and display the
 * temp eq in celsius
 *************************************************************************/
// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class Fahrenheit {

    public static void main(String[] args) {
      final int SIZE = 19;
      Double[] F = new Double[SIZE];
      Double[] C = new Double [SIZE];
      Double temp;
      InputStreamReader input = new InputStreamReader(System.in);
      BufferedReader reader = new BufferedReader(input);   
          // we catch exceptions if some are thrown.
      try {
       FillArray (F, C);
       PrintArray(F, C);
       System.out.println("please enter the temperature you want to convert");
       temp = Double.parseDouble(reader.readLine());
       System.out.printf(" you entered %3.2f, which is equivalent to %3.2f celsius\n", temp, FindCelsiusEq(F, C, temp));
      } catch (IOException e){
            System.out.println("Error reading from user");
      }
    }
   //////////////// function
    public static void FillArray( Double[] F, Double[] C){
      Double temp = 97.0;
      for (int i = 0; i<F.length; i++) {
        F[i] = temp;
        C[i] = (temp -32) * 5/9;
        temp = temp + .5;
      }
    }
    public static void PrintArray( Double[] F, Double[] C){
      System.out.print (" Fahrenheit: ");
      for (int i = 0; i<F.length; i++) {
        System.out.printf(" %3.2f", F[i]);
      }
      System.out.println();
      System.out.print ("   Celsius: ");
      for (int i = 0; i<F.length; i++) {
        System.out.printf(" %3.2f", C[i]);
      }
      System.out.println();
    }
    public static Double FindCelsiusEq(Double[] F, Double[] C, Double temp) {
      Double tempCelsius;
      boolean isFound = false;
      int index = 0;
      while (!isFound && index <F.length){
        if (F[index]>= (temp -.2) && F[index] <= (temp+ .2)) isFound = true;
        else index ++;
      }
      if (isFound) tempCelsius = C[index];
      else tempCelsius = 990.0;
      return tempCelsius;
    }
}


