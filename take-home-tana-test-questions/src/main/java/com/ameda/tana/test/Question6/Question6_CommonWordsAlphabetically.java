package com.ameda.tana.test.Question6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Author: kev.Ameda
 */
public class Question6_CommonWordsAlphabetically {

    // prob stat: Given a sentence or string return  3 most common words in it in ascending order

    public static void main(String[] args) {
        String input = "hi there care to discuss algorithm basis or how to solve algorithm or";
        String input1 = "Welcome to the world of Kevin. Kevin has been an incredible source of inspiration";
        List<String> result = topThreeWords(input1);
        System.out.println(result);
    }

    public static List<String> topThreeWords( String sentence ){
        if( sentence == null || sentence.trim().isEmpty()) return  Collections.emptyList();

        //step 1 normalize by removing punctuations, and lowercasing
        String []  words = sentence.toLowerCase().split("\\s+"); // 0(n)

        //step 2 count word frequencies
        Map<String, Long> wordCounts = Arrays.stream(words)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));  // 0(n)

        // Step 3, get top 3 frequencies
        // entrySet  has size k ( no. of unique words )
        // Sorting takes 0( k log k ) worst case scenario
        List<String> topWords = wordCounts.entrySet().stream()
                .sorted((a, b) -> Long.compare(b.getValue(), a.getValue())) // descending by count  O(k log k) happens here
                .limit(3)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.toList());
        return topWords;
    }

    /*
    *  Time & Space complexities
    * ------------------------------
    * n - denotes number of words in a sentence.
    * k - denotes number of unique words in the sentence.
    *  Time : 0(n) + 0(k log k) = O(n + k log k)
    *  Space: 0(n +k) = 0(n)
     * */

}
