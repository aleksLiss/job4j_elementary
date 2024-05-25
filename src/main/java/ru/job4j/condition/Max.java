package ru.job4j.condition;

public class Max {
    public static int max(int a, int b) {
        return a >= b ? a : b;
    }

    public static int max(int a, int b, int c) {
        int first = max(a, b);
        return first >= c ? first : c;
    }

    public static int max(int a, int b, int c, int d) {
        int first = max(a, b);
        int second = max(c, d);
        return first >= second ? first : second;
    }
}
