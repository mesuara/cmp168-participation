public abstract class Person extends Passenger {
  private int numOffspring;

  public Person(){
    numOffspring=0;
  }
  public Person(int num){
    numOffspring = num;
  }

  public Person(String nam, int year, double wei, double hei, char gen, int num, int numOff){
    super(nam, year, wei, hei, gen, num);
    if(numOff < 0) numOff = 0;
    this.numOffspring = numOff;
  }

public void setNumOffspring(int num){
  if(num < 0) num = 0;
  numOffspring = num;
}
  public int getNumOffspring(){
    return numOffspring;
  }


  @Override
  public String toString() {
    
    return super.toString() + String.format(" Person: Number of Offspring: %4d\n", numOffspring);
  }
  
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Person) {
      Person obj2 = (Person)obj;
      if (super.equals(obj) && (obj2.numOffspring == this.numOffspring)) {
        return true;
      }
    }
    return false;
  }
  
}
