package Opgave1;

import java.util.Scanner;

public class Main {
    //Oprindelig kode
/*    public int promptNumber(String msg) {
        System.out.println(msg);
        return Integer.parseInt(scan.nextLine());
    }*/

    //Rettet version
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        promptNumber("Write a number");
    }

    public static int promptNumber(String msg) {
        System.out.println(msg);
        try {
            return Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Wrong input, try again!");
            return promptNumber(msg);
        }
    }
}