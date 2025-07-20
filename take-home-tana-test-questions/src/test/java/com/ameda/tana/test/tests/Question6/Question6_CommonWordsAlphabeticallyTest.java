package com.ameda.tana.test.tests.Question6;

import com.ameda.tana.test.Question6.Question6_CommonWordsAlphabetically;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Author: kev.Ameda
 */
public class Question6_CommonWordsAlphabeticallyTest {

    @Test
    void test_edge_input1() {
        String input = "hi there care to discuss algorithm basis or how to solve algorithm or";
        List<String> result = Question6_CommonWordsAlphabetically.topThreeWords(input);
        assertEquals(List.of("algorithm", "or", "to"), result);
    }

    @Test
    void test_ties_in_occurrence() {
        String input = "a a b b c c d";
        List<String> result = Question6_CommonWordsAlphabetically.topThreeWords(input);
        assertEquals(List.of("a", "b", "c"), result); // all occur 2 times, alphabetically sorted
    }

    @Test
    void test_less_than_three_words() {
        String input = "one two";
        List<String> result = Question6_CommonWordsAlphabetically.topThreeWords(input);
        assertEquals(List.of("one", "two"), result);
    }

    @Test
    void test_empty_string() {
        String input = "";
        List<String> result = Question6_CommonWordsAlphabetically.topThreeWords(input);
        assertTrue(result.isEmpty());
    }

    @Test
    void test_null_input() {
        String input = null;
        List<String> result = Question6_CommonWordsAlphabetically.topThreeWords(input);
        assertTrue(result.isEmpty());
    }

    @Test
    void test_single_repeated_word() {
        String input = "test test test test";
        List<String> result = Question6_CommonWordsAlphabetically.topThreeWords(input);
        assertEquals(List.of("test"), result);
    }

    @Test
    void test_case_insensitivity() {
        String input = "Word word WORD wOrd";
        List<String> result = Question6_CommonWordsAlphabetically.topThreeWords(input);
        assertEquals(List.of("word"), result);
    }
}
