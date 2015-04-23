package by.bsu.lab4;

/**
 * Created by nikita on 03/04/15.
 */
public class Predator implements Clutches, Teeth {
    @Override
    public void gatherFood() {
        System.out.println("I gather food now");
    }

    @Override
    public void growl() {
        System.out.println("Do not have to annoy me, or I'll growl");
    }
}
