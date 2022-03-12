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
  
  
  
}