/*************************************************************************
 *Java shell
 * 
 * NOTE: I have put a lot of comments to guide you in the code.
 *************************************************************************/

// this is used to allow us to use classes in all the libraries of java.io
import java.io.*;

public class JavaShell {

    public static void main(String[] args) {
      // first we define our input streams.
      InputStreamReader input = new InputStreamReader(System.in);
      BufferedReader reader = new BufferedReader(input);   
      
      // put declarations here
      
      // we catch exceptions if some are thrown.
      try {
           // put code here
           // we need one I/O statement which can throw an exception otherwise we will have an 
           // error. remove after you create a real io statement.
        reader.readLine(); 
      } catch (IOException e){
            System.out.println("Error reading from user");
       }
      
    }

}


