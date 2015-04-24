package by.bsu.lab5.city;

/**
 * Created by Nikita on 24.04.2015.
 */
public class City {
    private String avenue;
    private String street;
    private String square;

    public class InnerCity {
        public String getAvenue() {
            return avenue;
        }

        public void setAvenue(String av) {
            avenue = av;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String str) {
            street = str;
        }

        public String getSquare() {
            return square;
        }

        public void setSquare(String sq) {
           square = sq;
        }
    }

    public InnerCity createObject(){ return new InnerCity(); }
}
