package Opgave2;

public class Main {
    public static void main(String[] args) {
        Drink drink = new Drink();
        try {
            drink.setPrice(-5.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Not valid price: " + e.getMessage());
        }
    }
}
