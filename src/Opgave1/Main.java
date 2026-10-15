package Opgave1;

import java.util.Scanner;

public class Main {
    //Oprindelig kode
/*    public int promptNumber(String msg) {
        System.out.println(msg);
        return Integer.parseInt(scan.nextLine());
    }*/

    //Rettet version
    Scanner scan = new Scanner(System.in);
    private String msg;

    public int promptNumber(String msg) {
        System.out.println(msg);
        try {
            return Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Wrong input, try again!");
            return promptNumber(msg);
        }
    }
}
