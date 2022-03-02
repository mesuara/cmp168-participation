import java.util.Scanner;

public class BasicDerivedOverride {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      PetData userPet = new PetData();
      String userName;
      int userAge;
      int userID;

      userName = scnr.next();
      userAge = scnr.nextInt();
      userID = scnr.nextInt();

      userPet.setName(userName);
      userPet.setAge (userAge);
      userPet.setID  (userID);
      userPet.printAll();
      System.out.println("");
   }
}