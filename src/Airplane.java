public class Airplane {
    private int speed; //Here I declared integer variable speed.
    private int numberofPassengers; // Here I declared integer variable numberofPassengers
    private int numberofGate; //Here I declared integer variable number of gate

// I created the Airplane method which depicts the previous variables
    public Airplane (int speed, int numberofPassengers, int numberofGate){
        this.speed = speed;
        this.numberofPassengers = numberofPassengers;
        this.numberofGate = numberofGate;
    }

//Here I created the method to return the number of the passengers
    public int getNumofPassengers () {
        return numberofPassengers;
    }
}