import java.util.Scanner;
import java.io.*;

public class ReadAndPrintFile {
  public static void main (String[] args) throws Exception{
    Scanner input = new Scanner(System.in);
    Scanner fileScanner=null;
    FileInputStream fileByteStream = null;
    boolean check = true;
    String userInputFile ="";
    while(check){
      System.out.println("What is the name of your file?");
      userInputFile = input.next();

      try{
        fileByteStream = new FileInputStream(userInputFile);
        fileScanner = new Scanner(fileByteStream);
        check = false;
      }
      catch(Exception NotFound){
        System.out.println("File Not Found " + userInputFile);
      }
    }

    while(fileScanner.hasNextLine()){
      System.out.println(fileScanner.nextLine());
    }
  }
}