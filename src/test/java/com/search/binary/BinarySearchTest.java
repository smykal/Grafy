package com.search.binary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void searchShouldReturnTrue() {
        //given
        int[] table = {1,2,3,4,5,6,8,9,10,20,32,53,63,67,86,91,92,93,94,95,101,102,106,120};
        table[17] = 93;

        //when
        Searching searching = new BinarySearch();
        int index = searching.search(table, 93);

        //then
        assertEquals(17,index);

    }
}