public class Teen extends Person implements Mover {
  @Override
  public String move() {
    return "run fast and jump";
  }

  @Override
  public double metabolizeAccumulatedCalories() {
    double weight = 0.0;
    int ca = this.getCaloriesAccumulator();

    while (ca - 5000 >= 0) {
      weight++;
      this.gainWeight();
      ca -= 5000;
    }
    if (ca < 5000) {
      double frac = ca / 5000.00;
      this.gainWeight(frac);
    }
    this.setCaloriesAccumulator(0);
    return weight;
  }

  @Override
  public String move(int num) {
    String resultStr = "";
    while (num > 1) {
      resultStr = resultStr + "run fast and jump\n";
      num--;
    }
    resultStr = resultStr + "run fast and jump";
    return resultStr;
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