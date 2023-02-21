
import java.util.*;

public class KAIA {
    public Vector <String> AirplanesList;
    public Vector <Integer> AirplanesCounts;
    public int AirplaneCount;

    KAIA(){
        AirplanesList = new Vector <String> ();
        AirplanesCounts = new Vector <Integer>();
        AirplaneCount = 0;
    }

    //Setters
    public void addAirplane (String name){
        AirplanesList.add(name);
        AirplanesCounts.add(0);
    }
//calculate total
    public void calculatetheNumber (String name){
        for (int i = 0; i < AirplanesList.size(); i++){
            if (AirplanesList.get(i).equals(name)){
                AirplaneCount++;
                AirplanesCounts.set(i, AirplanesCounts.get(i)+1);
            }
        }
    }
// print all resutls
    public void printResult (){
        System.out.println("The list of airplane manufacturer: \n"+AirplanesList+"\n");
        System.out.println("The total number of the airplanes: \n"+ AirplaneCount+"\n");
        for (int i = 0; i < AirplanesList.size(); i++){
            System.out.println(AirplanesList.get(i)+": ");
            System.out.println(AirplanesCounts.get(i)+" votes.");
        }
    }
}