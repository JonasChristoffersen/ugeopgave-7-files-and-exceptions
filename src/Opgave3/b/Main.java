package Opgave3.b;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readLines("data/menu.csv");
    }

    public static ArrayList readLines(String path) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File(path));
            while (scan.hasNextLine()) {
                lines.add(scan.nextLine());
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Filen blev ikke fundet");
        }
        return lines;
    }
}
