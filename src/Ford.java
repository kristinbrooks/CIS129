/*************************************************************************
 *  Compilation:  javac Ford.java
 *  Execution:    java Ford
 *  author: Odile wolf
 *
 *************************************************************************/
// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class Ford extends Car{

  public Ford() {
    super.setMake("Ford");
  }
/// attributes
    public void drive(int addedMileage) {
      System.out.println("you are driving a Ford");
      super.drive(addedMileage);
    }

}


