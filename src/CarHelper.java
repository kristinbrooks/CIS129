/*************************************************************************
 *  Compilation:  javac CarHelper.java
 *  Execution:    java CarHelper
 *  author: Odile wolf
 *
 *************************************************************************/
// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class CarHelper {

    public static void main(String[] args) {
      Honda HarryCar;
      Ford FredCar;
      
      HarryCar = new Honda();
      FredCar = new Ford();
   
      HarryCar.drive(200);
      FredCar.drive(200);
      System.out.println(" Fred is driving" + FredCar.getMake() + " and it has "+ FredCar.getMileage());
      System.out.println("Harry is driving a "+ HarryCar.getMake() + "and it has "+ HarryCar.getMileage());
    }
   
}


