package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP8K4Square2Dot56() {
        double expected = 2.56;
        int p = 8;
        double k = 4;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP8K4Square4Dot40() {
        double expected = 4.40;
        int p = 12;
        double k = 6;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}