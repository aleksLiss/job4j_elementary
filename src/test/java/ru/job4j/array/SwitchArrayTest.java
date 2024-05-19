package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    void whenSwapBorderArrayLengthIs4() {
        int[] input = {1, 2, 3, 4};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs6() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {6, 2, 3, 4, 5, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs3() {
        int[] input = {1, 2, 3};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs1() {
        int[] input = {1};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap1To2() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 1;
        int destination = 2;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 3, 2, 4, 5, 6};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap3ToLengthArrayMinus1() {
        int[] input = {1, 2, 3, 4, 5};
        int source = 3;
        int destination = input.length - 1;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 2, 3, 5, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap2To4() {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int source = 2;
        int destination = 4;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 2, 5, 4, 3, 6, 7};
        assertThat(result).containsExactly(expected);
    }

}