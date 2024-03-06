package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax35To28Then35() {
        int left = 35;
        int rignt = 28;
        int result = Max.max(left, rignt);
        int expected = 35;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax79To79Then79() {
        int left = 79;
        int right = 79;
        int result = Max.max(left, right);
        int expected = 79;
        assertThat(result).isEqualTo(expected);
    }
}