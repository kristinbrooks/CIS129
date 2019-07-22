/*************************************************************************
 *  Compilation:  javac Honda.java
 *  Execution:    java Honda
 *  author: Odile wolf
 *
 *************************************************************************/
// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class Honda extends Car {
    
    /// attributes
    private int maxMileage;
    
    /// methods
    public Honda() {
      super();
      System.out.println("creating the honda");
      maxMileage = 500000;
      super.setMake("Honda");
    }
    public void drive(int addedMileage) {
      if (getMileage() + addedMileage > maxMileage) 
        System.out.println("your car just died");
      else super.drive(addedMileage);
      System.out.println("out of drive");
    }
}


