public class Bombardier extends Airplane{
    private int length;

//method
    public Bombardier (int Speed, int NumberofPassengers, int NumberofGate, int length){
        super(Speed, NumberofPassengers, NumberofGate);
        this.length = length;
    }


//method
    public int getNumofPassengers () {
        if (length > 300){
            return super.getNumofPassengers() * (1);
        }

        else{
            return super.getNumofPassengers();
        }
    }
}