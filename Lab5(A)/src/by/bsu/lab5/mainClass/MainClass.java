package by.bsu.lab5.mainClass;

import by.bsu.lab5.city.City;

/**
 * Created by Nikita on 24.04.2015.
 */
public class MainClass {
    public static void main(String[] args){
        City city = new City();
        City.InnerCity object = city.createObject();
        object.setAvenue("Independence square");
        object.setStreet("Bobruyskaya street");
        object.setSquare("Oktyabrskaya square");
        System.out.println(object.getAvenue());
        System.out.println(object.getStreet());
        System.out.println(object.getSquare());

    }
}
