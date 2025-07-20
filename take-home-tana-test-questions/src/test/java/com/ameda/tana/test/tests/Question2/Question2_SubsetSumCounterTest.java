package com.ameda.tana.test.tests.Question2;

import com.ameda.tana.test.Question2.Question2_SubsetSumCounter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Author: kev.Ameda
 */
public class Question2_SubsetSumCounterTest {

    @Test
    void test_with_example_case_1() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 10;
        int expected = 3;
        int actual = Question2_SubsetSumCounter.countUniqueCombinations(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    void test_with_example_case_2() {
        int[] nums = {1, 2, 4, 7, 5};
        int target = 17;
        int expected = 1;
        int actual = Question2_SubsetSumCounter.countUniqueCombinations(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    void test_with_no_combination() {
        int[] nums = {1, 2, 3};
        int target = 100;
        int expected = 0;
        assertEquals(expected, Question2_SubsetSumCounter.countUniqueCombinations(nums, target));
    }

    @Test
    void test_with_single_element_match() {
        int[] nums = {5, 10, 15};
        int target = 10;
        assertEquals(1, Question2_SubsetSumCounter.countUniqueCombinations(nums, target));
    }

    @Test
    void test_with_empty_array() {
        int[] nums = {};
        int target = 5;
        assertEquals(0, Question2_SubsetSumCounter.countUniqueCombinations(nums, target));
    }

}
