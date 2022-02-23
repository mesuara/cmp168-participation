public class Driver {
    public static void main(String[] args) {

//       In the main method do the following:
// Create an Airplane that will store up to 100 Passengers
// Create 5 Passenger Objects with the details specified in the table below
// Add the 5 Passenger objects to the Airplane
// Call the printDetails method from the Airplane to print all the Airplane and Passenger details.

      Airplane spirit = new Airplane(100);
      Passenger p1 = new Passenger("Albert",1879,198.5,'m',2);
      Passenger p2 = new Passenger("Grace",1906,105,'f',1);
      Passenger p3 = new Passenger("Tim",1955,216.3,'m',2);
      Passenger p4 = new Passenger("Steve",1955,160,'m',2);
      Passenger p5 = new Passenger("Sergey",1973,165.35,'m',1);

      spirit.addPassenger(p1);
      spirit.addPassenger(p2);
      spirit.addPassenger(p3);
      spirit.addPassenger(p4);
      spirit.addPassenger(p5);

      spirit.printAllDetails();

    }
    
  }