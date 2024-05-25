package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDifferenceAndDivision(double first, double second) {
        return difference(first, second)
                + divide(first, second);
    }

    public static double sumAllOperationsFromMathFunctions(double first, double second) {
        return sumAndMultiply(first, second)
                + sumDifferenceAndDivision(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчёта равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат рассчёта суммы разности и деления чисел равен: " + sumDifferenceAndDivision(10, 20));
        System.out.println("Результат суммы всех операций равен: " + sumAllOperationsFromMathFunctions(10, 20));
    }
}
