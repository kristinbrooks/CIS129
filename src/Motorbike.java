/*************************************************************************
 *  Compilation:  javac Motorbike.java
 *  Execution:    java Motorbike
 *  author: Odile wolf
 *
 *************************************************************************/
// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class Motorbike extends TwoWheeler{

    /// attributes
    private String license;
    private int mileage;
    
    /// methods
    public String getLicense() {return license;}
    public void setLicense(String lic) {license = lic;}
    public int getMileage() {return mileage;}
    public void setMileage( int mile) {mileage = mile;}
    
    public Motorbike() { 
      super();
      license = "not done yet";
      mileage = 12;
      System.out.println("creating motorbike");

    }
}


