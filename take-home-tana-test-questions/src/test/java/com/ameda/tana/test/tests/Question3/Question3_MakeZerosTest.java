package com.ameda.tana.test.tests.Question3;

import com.ameda.tana.test.Question3.Question3_MakeZeros;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Author: kev.Ameda
 */
public class Question3_MakeZerosTest {

    @Test
    void test_edge_case() {
        int[] input = {1, 2, 3};
        assertEquals(1, Question3_MakeZeros.makeZerosExceptFirst(input));
    }

    @Test
    void test_already_zeros() {
        int[] input = {5, 0, 0, 0};
        assertEquals(1, Question3_MakeZeros.makeZerosExceptFirst(input));
    }

    @Test
    void test_unreducible_case() {
        int[] input = {5, 10, 8};
        assertEquals(0, Question3_MakeZeros.makeZerosExceptFirst(input));
    }

    @Test
    void test_big_numbers() {
        int[] input = {12, 36, 48, 60};
        assertEquals(1, Question3_MakeZeros.makeZerosExceptFirst(input));
    }

    @Test
    void test_all_same_as_first() {
        int[] input = {4, 4, 4, 4};
        assertEquals(1, Question3_MakeZeros.makeZerosExceptFirst(input));
    }

    @Test
    void test_empty_array() {
        int[] input = {};
        assertEquals(0, Question3_MakeZeros.makeZerosExceptFirst(input));
    }
}
