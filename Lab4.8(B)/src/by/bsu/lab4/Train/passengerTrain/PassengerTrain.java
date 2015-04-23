package by.bsu.lab4.Train.passengerTrain;

import by.bsu.lab4.Train.Train;
import by.bsu.lab4.Train.wagon.Wagon;

import java.util.List;

/**
 * Created by nikita on 03/04/15.
 */
public class PassengerTrain extends Train {

    public PassengerTrain(List<Wagon> listOfWagons) {
        this.setListOfWagons(listOfWagons);
    }

    public PassengerTrain() {

    }

    @Override
    public List<Wagon> getListOfWagons() {
        return super.getListOfWagons();
    }

    @Override
    public void setListOfWagons(List<Wagon> listOfWagons) {
        super.setListOfWagons(listOfWagons);
    }

    @Override
    public void setTypeTrain(String typeTrain) {
        super.setTypeTrain(typeTrain);
    }

    public void compareWagons(){
        Wagon[] mass = new Wagon[this.getListOfWagons().size()];

        int n = mass.length;

        for(int i = 0; i < this.getListOfWagons().size(); i++){
            mass[i] = this.getListOfWagons().get(i);
        }
        Wagon temp;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1; j++){
                if(mass[j].getComfortable() < mass[j + 1].getComfortable()) {
                    temp = mass[j];
                    mass[j] = mass [j + 1];
                    mass[j + 1] = temp;
                }
            }
            n--;
        }
        for(int i = 0; i < mass.length; i++)
            System.out.print(mass[i].getNumberOfWagon() + " ");
    }
    public void numberOfPassangers(){

        int totalNumberOfPassengers = 0;
        int totalNumberOfBaggages = 0;

        for(Wagon wagon: this.getListOfWagons()){
            totalNumberOfPassengers += wagon.getNumberOfPassengers();
            totalNumberOfBaggages += wagon.getNumberOfBaggages();
        }
        System.out.println("Total number of passengers: " + totalNumberOfPassengers);
        System.out.println("Total number of baggages: " + totalNumberOfBaggages);
    }
}
