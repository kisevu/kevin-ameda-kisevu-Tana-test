package com.ameda.tana.test.Question4;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Author: kev.Ameda
 */
public class Question4_UniqueProduct {

    public static void main(String[] args) {
        String[] input1 = {"Apple", "Computer", "Apple", "Bag"};
        String [] input2 = {"Java", "C++","Java","C++","Nodejs","C#","Nodejs"};
        String result = firstUniqueProduct(input2);
        System.out.println("First unique product: "+ result);
    }

    // TODO: Indentify a product that appears once in an array and return it or return null

    /*
    * Sample input ["Apple","Computer","Apple","Bag"]
    Computer and Bag appears once, but computer is the first one and so it should resolve to computer
    I am to determine how many times a product appears and the order of that appearance
    Hint - will use LinkedHashMap to store product count -> as it will preserve the insertion order which aid in finding first unique producer
    *
    * */


    public static String firstUniqueProduct( String [] products ){
        if( products == null || products.length == 0 ) return  null;

        // count product frequencies with insertion order preserved
       Map<String,Long > frequencyMap =  Arrays.stream(products)
                .collect(Collectors.groupingBy(
                        Function.identity(), // group by the string itself
                        LinkedHashMap::new, // preserve insertion order
                        Collectors.counting() // count occurrences/frequencies
                ));

       // Find the first product with count == 1
        return frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1) // keep only those seen once
                .map(Map.Entry::getKey) // get product name
                .findFirst() // pick the first outcome
                .orElse(null); // return null if none found

    }

    /*
    * Time complexity
     ----------------
     * 1st pass 0(n)  - counting frequencies
     * 2nd pass 0(n) - scanning map entries
     * Total = 0(n)
     Space complexity
     * -------------
     * 0(n) space
     *
     LinkedHashMap : maintains the insertion order, critical for finding first unique item
    * */



}
