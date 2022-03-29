import java.io.*;
import java.util.Scanner;

public class InputTextToOutputFile{
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
		System.out.println("What is the name of your output file?");
	
		String fileName = input.nextLine(); 

		try{

      //couldn't make it work with PrintWriter need to check into that.
			FileWriter filewriter = new FileWriter(fileName); 
			while(true){ 
				String sentence = input.nextLine();

        //check if it includes the word STOP!
				if (sentence.contains("STOP!")){
					filewriter.write(sentence); 
					break;
				}

        // add sentence and new line
				filewriter.write(sentence + '\n');
			}
			filewriter.close(); 
		}
		catch(Exception exception){ 
			System.out.println("File Not Found " + fileName);
		}
	}
}