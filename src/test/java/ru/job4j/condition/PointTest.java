package ru.job4j.condition;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {

    @Test
    void when00To20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when22To77Then7Dot07() {
        Point a = new Point(2, 2);
        Point b = new Point(7, 7);
        double output = a.distance(b);
        double expected = 7.07;
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus2Minus5To59Then15Dot65() {
        Point a = new Point(-2, -5);
        Point b = new Point(5, 9);
        double expected = 15.65;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00ToMinus3Minus7Then7Dot61() {
        Point a = new Point(0, 0);
        Point b = new Point(-3, -7);
        double expected = 7.61;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}