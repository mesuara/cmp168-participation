public class PetData extends AnimalData {
   private int idNum;

   public void setID(int petID) {
      idNum = petID;
   }

   // FIXME: Add printAll() member function

   /* Your solution goes here  */
   @Override
   public void printAll(){
      super.printAll();
      System.out.print(", ID: " + idNum  );
      
   }

}