package by.bsu.lab4.main;

import by.bsu.lab4.Train.passengerTrain.PassengerTrain;
import by.bsu.lab4.Train.wagon.Wagon;
import by.bsu.lab4.functions.CountOfWagons;
import by.bsu.lab4.functions.WagonWithParametrCountPassengers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikita on 03/04/15.
 */
public class MainClass {
    public static void main(String[] args) throws IOException {

        PassengerTrain pTrain = new PassengerTrain();
        pTrain.setTypeTrain("Passenger train");
        
        List<Wagon> listOfWagons = new ArrayList<Wagon>();
        listOfWagons.add(new Wagon("Business class", 5, 1, 73, 100));
        listOfWagons.add(new Wagon("Economy class", 2, 2, 58, 30));
        listOfWagons.add(new Wagon("Compartment", 4, 3, 30, 58));
        listOfWagons.add(new Wagon("Reserved seat", 1, 4, 100, 37));
        listOfWagons.add(new Wagon("Soft seats", 3, 5, 50, 55));

        pTrain.setListOfWagons(listOfWagons);
        System.out.println(pTrain.getTypeTrain());

        pTrain.compareWagons();
        System.out.println();
        pTrain.numberOfPassangers();

        CountOfWagons.countOfWagons(pTrain);

        System.out.println();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Enter diaposon1: ");
            int diaposon1 = Integer.parseInt(br.readLine());
            System.out.print("Enter diaposon2: ");
            int diaposon2 = Integer.parseInt(br.readLine());
            WagonWithParametrCountPassengers.wagonWithParametrCountPassengers(pTrain, diaposon1, diaposon2);
        }
        catch(NumberFormatException e){
            System.err.println("Invalid Format!");
        }

    }
}
