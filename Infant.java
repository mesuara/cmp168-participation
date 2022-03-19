public class Infant extends Person implements Mover {
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
    super();
    toys = new InfantToy[10];
    numBabyToys = 0;
  }

  public Infant(String name, int year, double wei, double hei, char gen, int num){
        super(name, year, wei, hei, gen,num, 0);
    		numBabyToys = 0;
		    toys = new InfantToy [10];
    
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
  public String getInfantToyName(int num){
    return (num >= 0 && num < numBabyToys) ?toys[num].infantToyName : "invalid index " + num;
    }
  
// getInfantToyRating(int) : int

  public int getInfantToyRating(int num){
    return (num >= 0 && num < numBabyToys) ?toys[num].infantToyRating : -1;
  }
// getHighestInfantToyRating(): int	//should return the highest rating, or 0 if the array is empty

  public int getHighestInfantToyRating(){
    int max = 0;
    for(int i =0; i < numBabyToys; i++){
      if(max < toys[i].infantToyRating){
        max = toys[i].infantToyRating;
      }
    }

    return max;
  }
// printDetails() : void		@Override //see NOTE below for formatting
  @Override 
  public void printDetails(){
    super.printDetails();
    		System.out.printf("Infant: Number of Toys: %4d | InfantToys: \n", numBabyToys);
		for (int i=0; i < numBabyToys; i++) {
			System.out.println(toys[i].toString());
		}
  }
// toString() : String		@Override //see NOTE below for formatting
  	@Override
    public String toString() {
        String basicStr = super.toString() + String.format("Infant: Number of Toys: %4d | Infant Toys:\n", numBabyToys);
        for (int i = 0; i < numBabyToys; i++) {
            basicStr = basicStr + toys[i].infantToyName + ", " + toys[i].infantToyRating + "; ";
        }
        return basicStr;
    }
  
@Override
  public double metabolizeAccumulatedCalories(){
double weight = 0;
		int calories = this.getCaloriesAccumulator();
		while (calories - 1200 >= 0) {
			weight++;
			this.gainWeight();
			calories = calories - 1200;
		}
		if (calories < 1200) {
			double num = calories / 1200.00;
			this.gainWeight(num);
		}
		this.setCaloriesAccumulator(0);
		return weight;
  }

  @Override
	public String move() {
		return "flail arms and legs";
	}


  @Override
  public String move(int times) {
    String str = "";
    if (times > 0) {
      for (int i = 0; i < times; i++) {
        str += "flail arms and legs\n";
      }
    }
    return str;
  }

    @Override
  public void eat(Food food) {
    this.setCaloriesConsumed(food.getCalories() + this.getCaloriesConsumed());
    this.setCaloriesAccumulator(food.getCalories() + this.getCaloriesAccumulator());
  }

  @Override
  public void eat(Food[] food) {
    int calories = 0;
    for (Food a : food) {
      calories += a.getCalories();
    }
    this.setCaloriesConsumed(this.getCaloriesConsumed() + calories);
    this.setCaloriesAccumulator(this.getCaloriesAccumulator() + calories);
  }
}