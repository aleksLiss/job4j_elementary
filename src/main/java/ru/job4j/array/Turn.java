package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int start = 0, finish = array.length - 1; start < finish; start++, finish--) {
            int temp = array[start];
            array[start] = array[finish];
            array[finish] = temp;
        }
        return array;
    }
}
