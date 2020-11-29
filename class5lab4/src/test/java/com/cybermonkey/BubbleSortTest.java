package com.cybermonkey;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {

    @Test
    public void assertCorrectSorting() {
        int arr[] = {84, 32, 45, 23, 11, 22, 90, 10};

        BubbleSort.bubbleSort(arr);

        int expected[] = {10, 11, 22, 23, 32, 45, 84, 90};
        assertThat(arr, is(expected));
    }
}
