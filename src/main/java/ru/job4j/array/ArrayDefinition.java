package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        System.out.printf("Размер массива 'ages' равен: %d", ages.length);
        System.out.printf("Размер массива 'surnames' равен: %d", surnames.length);
        System.out.printf("Размер массива 'prices' равен : %d", prices.length);
    }
}
