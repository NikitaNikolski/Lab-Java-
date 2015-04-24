package by.bsu.lab6.tanker;

import by.bsu.lab6.freightShip.FreightShip;

/**
 * Created by Nikita on 25.04.2015.
 */
public class Tanker extends FreightShip {
    private String name = "Tanker";
    @Override
    public void signal() {
        System.out.println("Beeb-beeeb, I'm a Tanker!");
    }
    public String getName(){
        return this.name;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return this.speed;
    }
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }
    public int getDisplacement(){
        return this.displacement;
    }
}
