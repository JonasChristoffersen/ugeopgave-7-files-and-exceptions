package Opgave6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<Drink> coffeeMenu = new ArrayList<>();
    private final String dataPath = "src/Opgave6/menu.csv";

    public void saveData() {
        try {
            FileWriter writer = new FileWriter(dataPath);
            writer.write("Name, Price, SoldNumber");
            for (Drink drink : coffeeMenu) {
                writer.write("\n" + drink);
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void loadData() {
        try {
            Scanner scan = new Scanner(new File(dataPath));
            scan.nextLine(); // Skip header in CSV file!
            while (scan.hasNextLine()) {
                String s = scan.nextLine();
                String[] values = s.split(",");
                String name = values[0].trim();
                int price = Integer.parseInt(values[1].trim());
                int soldNumber = Integer.parseInt(values[2].trim());
                coffeeMenu.add(new Drink(name, price, soldNumber));
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addDrink(Drink drink) {
        coffeeMenu.add(drink);
    }

    public void printMenu() {
        System.out.println("=== MENU ===");
        for (int i = 0; i < coffeeMenu.size(); i++) {
            Drink drink = coffeeMenu.get(i);
            System.out.println((i + 1) + ". " + drink.getName() + " - " + drink.getPrice() + " kr.");
        }
        System.out.println("0. Afslut");
    }

    public int getMenuSize() {
        return coffeeMenu.size();
    }

    public void buyDrink(int number) {
        Drink drink = coffeeMenu.get(number - 1);
        System.out.println("Du skal betale: " + drink.getPrice() + " kr.");
        drink.setSoldNumber(drink.getSoldNumber() + 1);
        saveData();
    }
}
