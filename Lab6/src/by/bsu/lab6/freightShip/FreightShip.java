package by.bsu.lab6.freightShip;

import by.bsu.lab6.interfaceShip.Ship;

/**
 * Created by Nikita on 25.04.2015.
 */
public abstract class FreightShip implements Ship {
    protected int speed;
    protected int displacement;
    protected String name;
    protected abstract String getName();
    public static void showNameOfTheShip(FreightShip ship){
        System.out.println(ship.getName());
    }
}
