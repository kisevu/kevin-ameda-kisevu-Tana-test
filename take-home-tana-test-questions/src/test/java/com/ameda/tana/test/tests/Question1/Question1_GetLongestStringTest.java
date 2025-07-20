package com.ameda.tana.test.tests.Question1;


import com.ameda.tana.test.Question1.Question1_GetLongestString;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * Author: kev.Ameda
 */
public class Question1_GetLongestStringTest {

    @Test
    void test_longest_string_with_valid_strings(){
        List<Character> validChars = Arrays.asList('A', 'B', 'C', 'D');
        List<String> input = Arrays.asList("AABCDA", "ABCDZADC", "ABCDBCA", "ABCDABDCA");
        String longestString = Question1_GetLongestString.getLongestString(validChars, input);
        assertEquals("ABCDABDCA", longestString );
    }

    @Test
    void test_longest_string_with_invalid_strings(){
        List<Character> validChars = Arrays.asList('A', 'B', 'C', 'D');
        List<String> input = Arrays.asList("XYZ", "LMN");
        String result = Question1_GetLongestString.getLongestString(validChars, input);
        assertEquals("not found", result);
    }


    @Test
    void test_get_longest_string_with_repeating_characters() {
        List<Character> validChars = Arrays.asList('A', 'B', 'C', 'D');
        List<String> input = Arrays.asList("AABBCC", "ABCCBA");
        String result = Question1_GetLongestString.getLongestString(validChars, input);
        assertEquals("not found", result);
    }


    @Test
    void test_get_longest_string_with_empty_input() {
        List<Character> validChars = Arrays.asList('A', 'B', 'C', 'D');
        List<String> input = Collections.emptyList();
        String result = Question1_GetLongestString.getLongestString(validChars, input);
        assertEquals("not found", result);
    }

    @Test
    void test_is_valid_null_or_empty() {
        assertFalse(Question1_GetLongestString.getLongestString(
                Arrays.asList('A', 'B', 'C', 'D'),
                Arrays.asList("", null)
        ).equals("ABC"));
    }


}
