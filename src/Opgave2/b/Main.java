package Opgave2.b;

import java.util.ArrayList;

public class Main {
    private static ArrayList<String> items = new ArrayList<>();

    public static void main(String[] args) {
        items.add("test1");
        items.add("test2");
        items.add("test3");
        items.add("test4");
        items.add("test5");
        items.add("test6");

        try {
            System.out.println(getItem(items, 5));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getItem(ArrayList<String> items, int index) {
        if (index < 0 || index >= items.size()) {
            throw new IllegalArgumentException(
                    "Index " + index + " is out of range 0/" + (items.size())
            );
        }
        return items.get(index);
    }
}
