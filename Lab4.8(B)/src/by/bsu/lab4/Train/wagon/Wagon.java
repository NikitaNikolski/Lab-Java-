package by.bsu.lab4.Train.wagon;

/**
 * Created by nikita on 03/04/15.
 */
public class Wagon {

    private int numberOfWagon;
    private String typeOfWagon;
    private int comfortable;
    private int numberOfPassengers;

    public int getNumberOfBaggages() {
        return numberOfBaggages;
    }

    public void setNumberOfBaggages(int numberOfBaggages) {
        this.numberOfBaggages = numberOfBaggages;
    }

    private int numberOfBaggages;

    public String getTypeOfWagon() {
        return typeOfWagon;
    }

    public void setTypeOfWagon(String typeOfWagon) {
        this.typeOfWagon = typeOfWagon;
    }

    public int getComfortable() {
        return comfortable;
    }

    public Wagon(String typeOfWagon, int comfortable, int numberOfWagon, int numberOfPassengers, int numberOfBaggages) {
        this.typeOfWagon = typeOfWagon;
        this.comfortable = comfortable;
        this.numberOfWagon = numberOfWagon;
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfBaggages = numberOfBaggages;
    }

    public void setComfortable(int comfortable) {
        this.comfortable = comfortable;
    }

    public int getNumberOfWagon() {
        return numberOfWagon;
    }

    public void setNumberOfWagon(int numberOfWagon) {
        this.numberOfWagon = numberOfWagon;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

}
