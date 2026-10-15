package Opgave2;

public class Drink {
    private double price;
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("May not be negative! " + price);
        }
        this.price = price;
    }
}
