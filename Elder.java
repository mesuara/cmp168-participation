public class Elder extends Person implements Mover {


  @Override
  public String move() {
    return "ouch my back wait for me";
  }

  @Override
  public String move(int num) {
    String resultStr = "";
    while (num > 1) {
      resultStr = resultStr + "ouch my back wait for me\n";
      num--;
    }
    resultStr = resultStr + "ouch my back wait for me";
    return resultStr;
  }

@Override
public double metabolizeAccumulatedCalories(){
    double weight = 0.0;
    int calories = this.getCaloriesAccumulator();
    while (calories - 300 >= 0) {
      weight++;
      this.gainWeight();
      calories = calories - 300;
    }
    if (calories < 300) {
      double frac = calories / 300.00;
      this.gainWeight(frac);
    }
    this.setCaloriesAccumulator(0);
    return weight;
  }

  @Override
  public void eat(Food food) {
    int foodCals = food.getCalories();

    this.setCaloriesConsumed(this.getCaloriesConsumed() + foodCals);

    this.setCaloriesAccumulator(this.getCaloriesAccumulator() + foodCals);
  }

  @Override
  public void eat(Food[] food) {
    int totalCaloriesAdded = 0;
    for (Food fudie : food) {
      totalCaloriesAdded = totalCaloriesAdded + fudie.getCalories();
    }
    this.setCaloriesConsumed(this.getCaloriesConsumed() + totalCaloriesAdded);
    this.setCaloriesAccumulator(this.getCaloriesAccumulator() + totalCaloriesAdded);
  }

}