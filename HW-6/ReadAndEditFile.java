import java.io.*;
import java.util.Scanner;

public class ReadAndEditFile {

      public static void main(String[] args) throws IOException {

            Scanner scanner = new Scanner(System.in);

            BufferedReader fileReader = null;
            while (fileReader == null) {

                  System.out.println("What is the name of your file?");

                  String name = scanner.nextLine();

                  try {

                        fileReader = new BufferedReader(new FileReader(new File(name)));


                  } catch (FileNotFoundException e) {

                        System.out.println("File Not Found " + name);

                        fileReader = null;

                  }

            }
            boolean startSent = true;
            int count;
            char char1;
            String results = ""; 
            char prevChar = ' '; 
            while ((count = fileReader.read()) != -1) {
                  char1 = (char) count;
                  if (startSent && Character.isLetter(char1)) {

                        char1 = Character.toUpperCase(char1);
                        results += char1;
                        startSent = false;
                  }
                  else if (char1 == ' ' || char1 == '\t') {

                        if (prevChar != ' ' && prevChar != '\t') {
                             results += ' ';
                        }
                  }
                  else if (char1 == '.') {
                        results += char1;
                        startSent = true;
                  }
                  else {
                        results += char1;
                  }
                  prevChar = char1;
            }

            fileReader.close();
            PrintWriter fileWrite = new PrintWriter(new File("HomeworkOutput6-2.txt"));
            fileWrite.print(results);
            fileWrite.close();
      }

}