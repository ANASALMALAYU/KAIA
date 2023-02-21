public class AirplaneTest {
    public static void main(String[] args) {

        Boeing myBoeing = new Boeing (10000, 300, 1, 30000);
        Airbus myAirbus = new Airbus(10000, 250, 2, 2015, 10);
        Bombardier myBombardier = new Bombardier(10000, 400, 3, 5000);
        Airbus myAirbus2 = new Airbus(15000, 310, 4, 2018, 10);
        
        
        
        System.out.println("My Boeing passengers: "+myBoeing.getNumofPassengers());
        System.out.println("My Airbus passengers: "+myAirbus.getNumofPassengers());
        System.out.println("My Bombardier passengers: "+myBombardier.getNumofPassengers());
        System.out.println("My Airbus passengers: "+myAirbus2.getNumofPassengers());



        KAIA ANAS = new KAIA();
        ANAS.addAirplane("Airbus");
        ANAS.addAirplane("Boeing");
        System.out.println("=================================================================");
        ANAS.calculatetheNumber("Boeing");
        ANAS.calculatetheNumber("Boeing");
        ANAS.calculatetheNumber("Airbus");
        ANAS.calculatetheNumber("Boeing");
        ANAS.calculatetheNumber("Boeing");
        ANAS.calculatetheNumber("Boeing");
        ANAS.calculatetheNumber("Boeing");
        ANAS.calculatetheNumber("Boeing");
        ANAS.calculatetheNumber("Boeing");
        ANAS.calculatetheNumber("Boeing");
        ANAS.calculatetheNumber("Boeing");
        ANAS.calculatetheNumber("Boeing");
        ANAS.calculatetheNumber("Boeing");
        ANAS.calculatetheNumber("Boeing");
        ANAS.calculatetheNumber("Boeing");
        ANAS.printResult();
    }
}