class Infant extends Person{
  //inner class
  class InfantToy{
    private String infantToyName;
    private int infantToyRating;
    
    public InfantToy(String name, int rating) {
			infantToyName = name;
			infantToyRating = rating;
		}

    @Override
		public String toString() {
			return String.format("InfantToy: Toy Name: %20s | Rating %4d\n", infantToyName, infantToyRating);
			
		}
  }
// infant toy continued
  private InfantToy[] toys;
  private int numBabyToys;

  public Infant(){
    toys = new InfantToy[10];
    numBabyToys = 0;
  }

  public Infant(String name, int year, double wei, double hei, char gen, int num){
        super(name, year, wei, hei, gen,num, 0);
    
  }
// addInfantToy(String,int)			//uses the InfantToy constructor, do not resize array
  public void addInfantToy(String nam, int num){
    InfantToy newToy = new InfantToy(nam, num);
    if(numBabyToys < 10){
      toys[numBabyToys] = newToy;
      numBabyToys++;
    }else{
      System.out.print("toys has reached capacity of 10");
    }
  }
  
// getInfantToyAsString(int) : String		//when the index is invalid, return "invalid index "+index 

  public String getInfantToyAsString(int num){
    return (num >=0 && num<numBabyToys) ? toys[num].toString(): "invalid index " + num;
  }
// getNumInfantToys() : int

  	public int getNumInfantToys() {
		return numBabyToys;
	}
// getInfantToyName(int) : String
// getInfantToyRating(int) : int
// getHighestInfantToyRating(): int	//should return the highest rating, or 0 if the array is empty
// printDetails() : void		@Override //see NOTE below for formatting
// toString() : String		@Override //see NOTE below for formatting
  
  
  
  
}