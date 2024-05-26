package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != symbol) {
                result += symbol;
                result += (counter > 2) ? counter - 1 : "";
                symbol = input.charAt(i);
                counter = 2;
            } else {
                counter++;
            }
        }
        result += (counter >= 2) ? symbol : "";
        result += (counter - 1 > 1) ? counter - 1 : "";
        return result;
    }
}
