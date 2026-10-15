package Opgave6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        Scanner scan = new Scanner(System.in);

        cafe.loadData();

        int choice = -1;
        while (choice != 0) {
            cafe.printMenu();
            System.out.print("Vælg nummer: ");
            choice = scan.nextInt();
            if (choice >= 1 && choice <= cafe.getMenuSize()) {
                cafe.buyDrink(choice);
            } else if (choice != 0) {
                System.out.println("Ugyldigt valg, prøv igen.");
            }
        }
        System.out.println("Tak for besøget!");
    }
}