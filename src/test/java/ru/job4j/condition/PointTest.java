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

    @Test
    void when000To235Then3Dot60() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 3, 5);
        double expected = 3.60;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus2Minus5Minus9To999Then17Dot80() {
        Point a = new Point(-2, -5, -9);
        Point b = new Point(9, 9, 9);
        double expected = 17.80;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when789ToMinus2Minus3Minus4Then14Dot21() {
        Point a = new Point(7, 8, 9);
        Point b = new Point(-2, -3, -4);
        double expected = 14.21;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}