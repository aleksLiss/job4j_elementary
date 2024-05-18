package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
class FactorialTest {

    @Test
    void whenCalculateFactorialFor0Then1() {
        int number = 0;
        int result = Factorial.calculate(number);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialFor1Then1() {
        int number = 1;
        int result = Factorial.calculate(number);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialFor5Then120() {
        int number = 5;
        int result = Factorial.calculate(number);
        int expected = 120;
        assertThat(result).isEqualTo(expected);
    }
}