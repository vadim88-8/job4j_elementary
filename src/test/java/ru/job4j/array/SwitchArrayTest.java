package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
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
    void whenSwap1to5() {
        int[] input = {5, 7, 8, 3, 2, 9, 4, 1};
        int source = 1;
        int destination = 5;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {5, 9, 8, 3, 2, 7, 4, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwap8to5() {
        int[] input = {1, 2, 3, 4, 5, 9, 7, 8, 6};
        int source = 8;
        int destination = 5;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result).containsExactly(expected);
    }
}