/*************************************************************************
 *  Compilation:  javac Car.java
 *  Execution:    java Car
 *  author: Odile wolf
 *
 *************************************************************************/
// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class Car extends Vehicle{

    /// attributes
    private String license;
    private int mileage;
    private String make;
    /// methods
    public String getLicense() {return license;}
    public void setLicense(String lic) {license = lic;}
    
    public int getMileage() {return mileage;}
    public void setMileage(int miles) {mileage = miles;}
   
    public String getMake() {return make;}
    public void setMake(String  myMake) {make = myMake;}
   
    public Car() { 
      super(4);
      license = "not done yet";
      System.out.println("creating car");
      mileage = 20;
    }
    public void drive(int addedMileage) {mileage = mileage + addedMileage;}
}


