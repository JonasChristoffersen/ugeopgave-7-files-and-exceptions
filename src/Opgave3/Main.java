package Opgave3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<String> lines = readLines("data/menu.csv");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Filen blev ikke fundet");
        }
    }

    public static ArrayList<String> readLines(String path) throws FileNotFoundException {
        ArrayList<String> lines = new ArrayList<>();
        Scanner scan = new Scanner(new File(path));
        while (scan.hasNextLine()) {
            lines.add(scan.nextLine());
        }
        scan.close();
        return lines;
    }
}
