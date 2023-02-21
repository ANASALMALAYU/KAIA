public class Airbus extends Airplane { //Class Airbus extends Airplane
    private int year; //varible declared
    private int manufacturer; // varible declared

// Class created 
    public Airbus (int speed, int numberofPassengers, int numberofGate, int year, int manufacturer) {
        super (speed, numberofPassengers, numberofGate); // super is a reference keyword used to call the variables
        this.year = year; //this 
        this.manufacturer = manufacturer;
    }

// method created to return the total number of passengers
    public int getNumofPassengers (){
        return super.getNumofPassengers() * (1);
    }
}
