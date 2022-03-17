public abstract class Passenger implements Eater {
  private String name;
  private int birthYear;
  private double weight;
  private char gender;
  private int numCarryOn;
  private double height;
  private int caloriesConsumed = 0;
  private int caloriesAccumulator = 0;

  public Passenger() {
    name = "";
    birthYear = 1900;
    weight = 0.0;
    gender = 'u';
    numCarryOn = 0;
    height = 0.0;
  }

  public Passenger(String na, int birth, double weg, double hei, char gen, int carry) {
    this.name = na;
    this.birthYear = birth;
    if (hei < 0)
      hei = -1;
    this.height = hei;
    if (weg < 0)
      weg = -1;
    this.weight = weg;
    if (gen != 'f' && gen != 'm')
      gen = 'u';
    this.gender = gen;
    if (carry < 0)
      carry = 0;
    if (carry > 2)
      carry = 2;
    this.numCarryOn = carry;
  }

  public int getCaloriesConsumed() {
    return this.caloriesConsumed;
  }

  public void setCaloriesConsumed(int num) {
    caloriesConsumed = num;
  }

  public int getCaloriesAccumulator() {
    return this.caloriesAccumulator;
  }

  public void setCaloriesAccumulator(int num){
    caloriesAccumulator = num;
  }

  public abstract double metabolizeAccumulatedCalories();

  
  public int calculateAge(int year) {
    int age = year - this.birthYear;
    if (age < 0) {
      age = -1;
    }
    return age;

  }

  public void gainWeight() {
    weight++;
  }

  public void gainWeight(double addNum) {

    this.weight += addNum;
    this.weight = this.weight < 0 ? this.weight = 0 : this.weight;

  }

  public int getBirthYear() {
    return birthYear;
  }

  public char getGender() {
    return gender;
  }

  public String getName() {
    return name;
  }

  public double getWeight() {
    return weight;
  }

  public double getHeight() {
    return height;
  }

  public int getNumCarryOn() {
    return numCarryOn;
  }

  public boolean isFemale() {
    return this.getGender() == 'f';
  }

  public boolean isMale() {
    return this.getGender() == 'm';
  }

  public void loseWeight() {
    weight--;
    this.weight = this.weight < 0 ? this.weight = 0 : this.weight;
  }

  public void loseWeight(double num) {
    this.weight = this.weight - num;
    this.weight = this.weight < 0 ? this.weight = 0 : this.weight;
  }

  public double calculateBMI() {
    double bmi = (weight * 703) / Math.pow(height, 2.0);
    return bmi;
  }

  public void printDetails() {
    System.out.printf(
        "Name: %20s | Year of Birth: %4d | Weight: %10.2f |  Height: %10.2f |   Gender: %c | NumCarryOn: %2d\n ",
        this.name, this.birthYear, this.weight, this.height, this.gender, this.numCarryOn);
  }

  // + setGender(char) : void // if input value is not 'm' or 'f', set gender to
  // 'u' (unknown)
  // + setName(String) : void
  // + setBirthYear(int) : void
  // + setWeight(double) : void //if input value is negative, set weight to -1
  // + setNumCarryOn(int): void //if input value is negative, set numCarryOn to 0,
  // if it is greater than 2 set to 2
  public void setGender(char item) {
    if (item != 'f' && item != 'm') {
      this.gender = 'u';
    } else {
      this.gender = item;
    }

  }

  public void setName(String someName) {
    this.name = someName;
  }

  public void setBirthYear(int someNum) {
    this.birthYear = someNum;
  }

  public void setWeight(double someNum) {
    if (someNum < 0) {
      this.weight = -1;
    } else {
      this.weight = someNum;
    }
  }

  public void setHeight(double someNum) {
    if (someNum < 0) {
      this.height = -1;
    } else {
      this.height = someNum;
    }
  }

  public void setNumCarryOn(int someNum) {
    if (someNum < 0) {
      this.numCarryOn = 0;
    } else if (someNum > 2) {
      this.numCarryOn = 2;
    } else {
      this.numCarryOn = someNum;
    }
  }

  // overide methods
  // toString() : String @Override //see Note1 for format
  // equals(Object) : boolean @Override //see Note2 for equality checks

  @Override
  public String toString() {
    return String.format(
        "Name: %20s | Year of Birth: %4d | Weight: %10.2f | Height: %10.2f | Gender: %c | NumCarryOn: %2d\n", name,
        birthYear, weight, height, gender, numCarryOn);

  }

  @Override
  public boolean equals(Object objA) {
    if (objA instanceof Passenger) {
      Passenger objB = (Passenger) objA;
      if (objB.name == this.name && objB.birthYear == this.birthYear && objB.weight == this.weight
          && objB.height == this.height && objB.gender == this.gender && objB.numCarryOn == this.numCarryOn) {
        return true;
      }
    }
    return false;
  }

}