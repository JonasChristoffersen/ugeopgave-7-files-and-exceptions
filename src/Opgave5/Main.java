package Opgave5;

import java.util.ArrayList;

public class Main {
    private static ArrayList<String> data = new ArrayList<>();
    public static void main(String[] args) {
        data.add("Vand, Stille kildevand, gratis");

        double total = 0;
        for (String s : data) {
            String[] values = s.split(",");
            String name = values[0].trim();
            String description = values[1].trim();
            try {
                double price = Double.parseDouble(values[2].trim());
                total += price;
                System.out.println(name + " - " + description + " (" + price + " kr)");
            } catch (NumberFormatException e) {
                System.out.println(name + " - kunne ikke læse pris: " + values[2].trim());
            }
        }
        System.out.println("Samlet pris: " + total + " kr");
    }
}
