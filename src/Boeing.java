public class Boeing extends Airplane {
    private int weight;

    // created method
    public Boeing (int speed, int numberofPassengers, int numberofGate, int weight) {
        super(speed, numberofPassengers, numberofGate);
        this.weight = weight;
    }

//method
    public int getNumofPassengers (){
        if (weight > 300) {
            return super.getNumofPassengers() * (1);
        }
        else{
            return super.getNumofPassengers();
        }
    }
}