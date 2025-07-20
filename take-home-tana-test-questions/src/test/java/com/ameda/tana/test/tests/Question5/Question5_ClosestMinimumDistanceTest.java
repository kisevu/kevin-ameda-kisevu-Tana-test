package com.ameda.tana.test.tests.Question5;

import com.ameda.tana.test.Question5.Question5_ClosestMinimumDistance;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Author: kev.Ameda
 */
public class Question5_ClosestMinimumDistanceTest {

    @Test
    void test_edge_case1() {
        int[] input = {1, 2, 3, 1, 4, 5, 2};
        int result = Question5_ClosestMinimumDistance.findClosestMinimumDistance(input);
        assertEquals(3, result);
    }

    @Test
    void test_minimum_occurrence_at_end() {
        int[] input = {3, 4, 5, 6, 1, 7, 1};
        int result = Question5_ClosestMinimumDistance.findClosestMinimumDistance(input);
        assertEquals(2, result);
    }

    @Test
    void test_minimum_occurs_more_than_twice() {
        int[] input = {5, 1, 6, 1, 8, 1};
        int result = Question5_ClosestMinimumDistance.findClosestMinimumDistance(input);
        assertEquals(2, result);
    }

    @Test
    void test_all_elements_are_minimum() {
        int[] input = {1, 1, 1, 1};
        int result = Question5_ClosestMinimumDistance.findClosestMinimumDistance(input);
        assertEquals(1, result);
    }

    @Test
    void test_array_of_two_minimums() {
        int[] input = {2, 1, 3, 1};
        int result = Question5_ClosestMinimumDistance.findClosestMinimumDistance(input);
        assertEquals(2, result);
    }

    @Test
    void test_innvalid_short_array() {
        int[] input = {1};
        assertThrows(IllegalArgumentException.class,
                () -> Question5_ClosestMinimumDistance.findClosestMinimumDistance(input));
    }
}
