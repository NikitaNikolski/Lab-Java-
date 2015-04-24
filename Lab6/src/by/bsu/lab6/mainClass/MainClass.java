package by.bsu.lab6.mainClass;

import by.bsu.lab6.freightShip.FreightShip;
import by.bsu.lab6.tanker.Tanker;

/**
 * Created by Nikita on 25.04.2015.
 */
public class MainClass {
    public static void main(String[] args){
        Tanker ship = new Tanker();
        ship.signal();
        FreightShip.showNameOfTheShip(ship);

    }
}
