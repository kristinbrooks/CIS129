/*************************************************************************
 *  Compilation:  javac VehicleHelper.java
 *  Execution:    java VehicleHelper
 *  author: Odile wolf
 *
 *************************************************************************/
// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class VehicleHelper {

    public static void main(String[] args) {
     
      Motorbike myBike = new Motorbike();
      Car myCar = new Car();
      myBike.setColor("blue");
      myBike.setMileage(20000);
      System.out.println(" my car has "+ myCar.getNumWheels() + "and it is "+ myCar.getColor());
      System.out.println(" my bike has "+ myBike.getNumWheels()+ "and it is "+ myBike.getColor());
      System.out.println(" and it has "+ myBike.getMileage() + " miles");
      
      Honda myHonda = new Honda();
      myHonda.drive(20000);
      
      System.out.println(" my honda has "+ myHonda.getNumWheels() + "and it is "+ myHonda.getColor());
      System.out.println("My honda has "+ myHonda.getMileage()+ "miles");
      myHonda.drive(1000000);
    }
   
}


