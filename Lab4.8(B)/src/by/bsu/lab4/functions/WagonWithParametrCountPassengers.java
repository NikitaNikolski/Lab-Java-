package by.bsu.lab4.functions;

import by.bsu.lab4.Train.Train;
import by.bsu.lab4.Train.wagon.Wagon;

/**
 * Created by nikita on 04/04/15.
 */
public class WagonWithParametrCountPassengers {
    public static void wagonWithParametrCountPassengers(Train train, int diaposon1, int diaposon2){
        int count = 0;
        for(Wagon wagon: train.getListOfWagons()){
            if(wagon.getNumberOfPassengers() >= diaposon1 && wagon.getNumberOfPassengers() <= diaposon2) {
                System.out.print(wagon.getNumberOfWagon() + " ");
                count++;
            }
        }
        if(count == 0)
            System.out.println("There is no wagons with such diaposon of passengers");
    }
}
