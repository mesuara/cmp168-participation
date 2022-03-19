class Airplane {
  private Passenger[] passengers;
  private String airplaneName;
  private int numPassengers;

  public Airplane() {
    this.passengers = new Passenger[100];
    this.numPassengers = 0;
    this.airplaneName = "";
  }

  public Airplane(String name) {
    this.passengers = new Passenger[100];
    this.numPassengers = 0;
    this.airplaneName = name;
  }

  public Airplane(int num) {
    this.passengers = num > 0 ? new Passenger[num] : new Passenger[0];
    this.numPassengers = 0;
    this.airplaneName = "";
  }

  public Airplane(String name, int num) {
    this.passengers = num > 0 ? new Passenger[num] : new Passenger[0];
    this.numPassengers = 0;
    this.airplaneName = name;
  }

  /**
   * addPassenger(Passenger) : void getAirplaneName() : String getPassenger(int) :
   * Passenger //return null if index is invalid getNumPassengers() : int //notice
   * no setter… this is a controlled variable getFirstPassenger() : Passenger
   * 
   **/
  public void addPassenger(Passenger passObj) {
      if(numPassengers >= passengers.length){
         if (this.passengers.length == 0)
            this.passengers = new Passenger[1];
        else {
            Passenger[] temp = this.passengers;
            this.passengers = new Passenger[this.passengers.length * 2];
            if (temp.length >= 0) System.arraycopy(temp, 0, this.passengers, 0, temp.length);
        }
    
      }

        passengers[numPassengers] =passObj;
        numPassengers++;
  }

  public int getNumPassengers() {
    return this.numPassengers;
  }

  public String getAirplaneName() {
    return airplaneName;
  }

  public Passenger getPassenger(int i) {
    if ((i >= 0 && i < passengers.length) && this.passengers[i] != null) {
      return passengers[i];
    }

    return null;
  }

  public Passenger getFirstPassenger() {
    return passengers[0];
  }

  /**
   * getLastPassenger() : Passenger getPassengers() : Passenger [ ]
   * setAirplaneName(String) : void printAllDetails() : void // prints Airplane
   * attributes Passenger
   **/

  public Passenger getLastPassenger() {
    return passengers[numPassengers - 1];
  }

  public Passenger[] getPassengers() {
    return this.passengers.length == 0 ? null : this.passengers;
  }

  public void setAirplaneName(String name) {
    this.airplaneName = name;
  }

  public void printAllDetails() {
    System.out.printf("AirplaneName: %20s| Number of Passengers: %4d| Airplane Size: %4d\n ", this.airplaneName,
        this.numPassengers, this.passengers.length);
    for (int i = 0; i < this.numPassengers; i++)
      this.getPassengers()[i].printDetails();
  }

  /**
   * removePassenger(int) : Passenger removeAllPassengers() : void
   * getTotalWeightOfAllPassengers() : double getAverageWeightOfAllPassengers() :
   * double getNumberOfPassengersAboveWeight(double) : int
   * getNumberOfPassengersBelowWeight(double) : int
   * increaseWeightOfAllPassengers() : void increaseWeightOfAllPassengers(double)
   * : void
   * 
   **/

  public Passenger removePassenger(int j) {
    if ((j >= 0 && j < passengers.length) && this.passengers[j] != null) {
      Passenger placeholder = passengers[j];
      for (int i = j; i < this.numPassengers - 1 && this.passengers[i] != null; i++){
        passengers[i] = passengers[i + 1];
      }

      passengers[passengers.length - 1] = null;

      this.numPassengers--;
      return placeholder;
    }
    return null;

  }

  public void removeAllPassengers() {
    this.passengers = new Passenger[0];
    this.numPassengers = 0;
  }


  public double getTotalWeightOfAllPassengers() {
    
    double total = 0.0;
    for (int i = 0; i < numPassengers; i++) {
      total += this.passengers[i].getWeight();
    }
    return total;
  }

  public double getAverageWeightOfAllPassengers() {
    return getTotalWeightOfAllPassengers() / numPassengers;
  }

  public int getNumberOfPassengersAboveWeight(double num) {
    int counter = 0;
    for (int i = 0; i < this.numPassengers; i++) {
      if (this.passengers[i].getWeight() > num) {
        counter++;
      }
    }

    return counter;
  }

  public int getNumberOfPassengersBelowWeight(double num) {
    int counter = 0;
    for (int i = 0; i < this.numPassengers; i++) {
      if (this.passengers[i].getWeight() < num) {
        counter++;
      }
    }

    return counter;
  }

  public void increaseWeightOfAllPassengers() {
    for (int i = 0; i < this.numPassengers; i++)
      this.passengers[i].gainWeight();
  }

  public void increaseWeightOfAllPassengers(double value) {
    for (int i = 0; i < this.numPassengers; i++)
      this.passengers[i].gainWeight(value);
  }

}