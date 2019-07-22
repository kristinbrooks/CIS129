/*************************************************************************
 *  Compilation:  javac petHelper.java
 *  Execution:    java petHelper
 *  author: Odile wolf
 *
 *************************************************************************/
// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class petHelper {

    public static void main(String[] args) {
     
      Pet kitty, Jack;
      Jack = new Pet(); 
      kitty = new Pet();
      Jack.setName("Jack");
      Jack.setOwner("Laura");
      Jack.setType("dog");
      Jack.setAge(4);
      kitty.setName("Kitty");
      kitty.setOwner("Mary");
      kitty.setType("cat");
      kitty.setAge(2);
      System.out.println(Jack.getName() + " is " +Jack.getOwner()+"'s "+ Jack.getType());
      System.out.println(kitty.getName() + " is " +kitty.getOwner()+"'s "+ kitty.getType());
     
    }
   
}


