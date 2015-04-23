package by.bsu.lab4.functions;

import by.bsu.lab4.Train.Train;

/**
 * Created by nikita on 04/04/15.
 */
public class CountOfWagons {
    public static void countOfWagons(Train train){
        System.out.println("Count of wagons:" + train.getListOfWagons().size());
    }
}
