package ru.job4j.condition;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PointTest {

    @Test
    void when00To20Then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when22To77Then7Dot07() {
        double expected = 7.07;
        int x1 = 2;
        int y1 = 2;
        int x2 = 7;
        int y2 = 7;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus2Minus5To59Then15Dot65() {
         double expected = 15.65;
         int x1 = -2;
         int y1 = -5;
         int x2 = 5;
         int y2 = 9;
         double output = Point.distance(x1, y1, x2, y2);
         assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00ToMinus3Minus7Then7Dot61() {
        double expected = 7.61;
        int x1 = 0;
        int y1 = 0;
        int x2 = -3;
        int y2 = -7;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}