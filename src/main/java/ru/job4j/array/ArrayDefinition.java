package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.printf("Размер массива 'ages' равен: %d\n", ages.length);
        System.out.printf("Размер массива 'surnames' равен: %d\n", surnames.length);
        System.out.printf("Размер массива 'prices' равен : %d\n", prices.length);
        String[] names = new String[4];
        names[0] = "Anya";
        names[1] = "Nina";
        names[2] = "Misha";
        names[3] = "Kolya";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
