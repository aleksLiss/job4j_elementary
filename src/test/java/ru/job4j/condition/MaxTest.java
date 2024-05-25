package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = -1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To1Then5() {
        int left = 5;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax0To9Then9() {
        int left = 0;
        int right = 9;
        int result = Max.max(left, right);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax9To9ThenAny() {
        int left = 1;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA3B3C7Then7() {
        int a = 3;
        int b = 3;
        int c = 7;
        int result = Max.max(a, b, c);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA5B2C1Then5() {
        int a = 5;
        int b = 2;
        int c = 1;
        int result = Max.max(a, b, c);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenAMinus2B0C3D6Then6() {
        int a = -2;
        int b = 0;
        int c = 3;
        int d = 6;
        int result = Max.max(a, b, c, d);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenA2B9C2D2Then9() {
        int a = 2;
        int b = 9;
        int c = 2;
        int d = 2;
        int result = Max.max(a, b, c, d);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}