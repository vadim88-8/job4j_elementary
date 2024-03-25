package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortAnArrayOf3() {
        int[] input = new int[]{88, 87, 1};
        int[] result = SortSelected.sort(input);
        int[] expected = new int[]{1, 87, 88};
        assertThat(result).containsExactly(expected);
    }
}