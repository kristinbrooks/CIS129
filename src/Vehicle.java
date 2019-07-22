/*************************************************************************
 *  Compilation:  javac Vehicle.java
 *  Execution:    java Vehicle
 *  author: Odile wolf
 *
 *************************************************************************/
// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class Vehicle {

    /// attributes
  private int numWheels;
  private String color;
  
    /// methods
  public void setNumWheels(int wheels) { numWheels = wheels;}
  public int getNumWheels() { return numWheels;}
  
  public void setColor( String newColor) { color = newColor;}
  public String getColor() {return color;}
  
  public Vehicle(int num) { numWheels = num;
    color = "black";
    System.out.println("creating vehicle");
  }
}


