package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int start = 0; start < array.length / 2; start++) {
            int temp = array[start];
            array[start] = array[array.length - start - 1];
            array[array.length - start - 1] = temp;
        }
        return array;
    }
}
