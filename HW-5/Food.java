class Food{

  private String name;
  private int calories;

  public Food(String na, int num){
    this.name = na;
    this.calories = num;
  }

  public void setName(String na){
    name = na;
  }

  public String getName(){
    return this.name;
  }

  public void setCalories(int num){
    calories = num;
  }

  public int getCalories(){
    return this.calories;
  }

  @Override
  public String toString(){
    return String.format("Food - name: %10s | calories: %4d", name, calories);
  }

  @Override
  public boolean equals(Object obj){
    if (obj instanceof Food) {
      Food obj2 = (Food)obj;
      if (obj2.name == this.name && obj2.calories == this.calories) {
        return true;
      }
    }
    return false;
  }


   
}