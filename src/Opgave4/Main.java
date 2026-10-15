package Opgave4;

import java.util.ArrayList;

public class Main {
    private static ArrayList<String> data = new ArrayList<>();
    public static void main(String[] args) {
        data.add("Espresso, En kraftfuld og koncentreret kaffe, 25.0");
        data.add("Latte, Espresso med dampet mælk, 45.0");
        data.add("Cola, Kold og brusende, 30.0");

        for (String s : data) {
            String[] values = s.split(",");
            String name = values[0].trim();
            String description = values[1].trim();
            String price = values[2].trim();
            System.out.println(name + " - " + description + " (" + price + " kr)");
        }
    }
}
