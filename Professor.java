public class Professor extends Employee {
   private String subject;

   public void setSubject(String setSubject) {
      subject = setSubject;
   }

   @Override
   public void printInfo() {
      System.out.println(name + " teaches " + subject);
   }
}