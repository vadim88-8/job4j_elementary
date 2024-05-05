package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double result = a.distance(b);
        double expected = 2.0;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to22then1dot41() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 2);
        double result = a.distance(b);
        double expected = 1.41;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when21to44then3dot60() {
        Point a = new Point(2, 1);
        Point b = new Point(4, 4);
        double result = a.distance(b);
        double expected = 3.60;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to55then5dot65() {
        Point a = new Point(1, 1);
        Point b = new Point(5, 5);
        double result = a.distance(b);
        double expected = 5.65;
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }
}