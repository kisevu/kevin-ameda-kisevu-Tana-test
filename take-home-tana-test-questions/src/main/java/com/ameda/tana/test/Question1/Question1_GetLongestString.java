package com.ameda.tana.test.Question1;

import java.util.*;

/**
 * Author: kev.Ameda
 */
public class Question1_GetLongestString {

    public static void main(String[] args) {

        List<Character> validChars = Arrays.asList('A', 'B', 'C', 'D');
        List<String> inputStrings = Arrays.asList(
                "AABCDA",
                "ABCDZADC",
                "ABCDBCA",
                "ABCDABDCA"
        );

        String result = Question1_GetLongestString.getLongestString(validChars,inputStrings);
        System.out.println("Longest valid string "+ result );
    }

    public static String getLongestString( List<Character> chars,List<String> strings  ){
        Set<Character> validChars = new HashSet<>(chars);
        return strings.stream()
                .filter(s -> isValid(s,validChars)) // perform those two TODO: checks
                .max(Comparator.comparingInt(String::length)) // get longest String
                .orElse("not found"); // not found the longest if none
    }


    private static boolean isValid( String s, Set<Character> validChars ){
        //TODO: Ensure no-repeating characters;
        //TODO: Ensure no invalid i.e from ABCD so no other laters of alphabet

        if( s==null || s.isEmpty()){
            // logs for debugging below
            System.out.println(" String input evaluated to null or empty ");
            return false;
        }
        // storing the valid chars to a collection
        char[] charArray = s.toCharArray();
        char before = '\0';  // placeholder to carefully test to comparisons

        for( char c: charArray ){
            //ensure that no invalids here (or not characters outside the ones contained in validChars)
            //This check does this evaluation here. If so return false and proceed...
            if(!validChars.contains(c)) return false;
            if( c == before ) return false;
            before = c;
        }
        return true;
    }


}
