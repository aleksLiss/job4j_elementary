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
        int result = Math.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax0To9Then9() {
        int left = 0;
        int right = 9;
        int result = Math.max(left, right);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax9To9ThenAny() {
        int left = 1;
        int right = 1;
        int result = Math.max(left, right);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}