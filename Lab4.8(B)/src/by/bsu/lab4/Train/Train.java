package by.bsu.lab4.Train;

import by.bsu.lab4.Train.wagon.Wagon;

import java.util.List;

/**
 * Created by nikita on 03/04/15.
 */
public abstract class Train {

    private int numberWagons;
    private String typeTrain;
    private List<Wagon> listOfWagons;

    public List<Wagon> getListOfWagons() {
        return listOfWagons;
    }

    public void setListOfWagons(List<Wagon> listOfWagons) {
        this.listOfWagons = listOfWagons;
    }

    public int getNumberWagons() {
        return numberWagons;
    }

    public void setNumberWagons(int numberWagons) {
        this.numberWagons = numberWagons;
    }

    public String getTypeTrain() {
        return typeTrain;
    }

    public void setTypeTrain(String typeTrain) {
        this.typeTrain = typeTrain;
    }

    public abstract void compareWagons();
}
