import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.util.*;

public class PreLab9 {
  public String transmitFile(String filename1, String filename2) throws IOException {
          String output = "";
          Scanner scan = new Scanner(new File(filename1)) ;
    
          while(scan.hasNextLine()) {
              String[] token = scan.nextLine().split("-") ;
              for (String str : token) {
                  String code = transmit(str);
                  output += code + " " ;
              }
              output = output + "\n" ;
          }
          try(FileWriter f = new FileWriter(filename2, false)) {
              f.write(output);
          } catch(IOException e) {
              System.err.println(e.getMessage()) ;
          }

          scan.close() ;
          return output;
      }
  
      public String translateFile(String filename1, String filename2) throws FileNotFoundException {
          String output = "" ;
          Scanner scan = new Scanner(new File(filename1)) ;
        
          while(scan.hasNextLine()) {
              String[] token = scan.nextLine().split(" ") ;
              for(String str : token) {
                  if(!str.isEmpty()) {
                      String word = translate(str) ;
                      output += word ;
                  } else {
                      output = output + "-" ;
                  }
              }
              output = output + "\n" ;
          }
          try(FileWriter f = new FileWriter(filename2, false)) {
              f.write(output) ;
          } catch (IOException e) {
              System.err.println(e.getMessage()) ;
          }
          
          scan.close() ;
          return output;
      }
}
