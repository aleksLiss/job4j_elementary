package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != symbol) {
                result += symbol;
                result += (counter > 1) ? counter : "";
                symbol = input.charAt(i);
                counter = 1;
            } else {
                counter++;
            }
        }
        result += (counter > 1) ? "" + symbol + counter : symbol;
        return result;
    }
}
