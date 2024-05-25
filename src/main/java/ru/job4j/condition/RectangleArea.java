package ru.job4j.condition;

public class RectangleArea {
    public static double square(int perimeter, double k) {
        double height = perimeter / (2 * (k + 1));
        double length = height * k;
        double square = length * height;
        return square;
    }
}