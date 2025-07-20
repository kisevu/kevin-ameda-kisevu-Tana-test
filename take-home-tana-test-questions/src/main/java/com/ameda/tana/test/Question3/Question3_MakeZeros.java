package com.ameda.tana.test.Question3;

/**
 * Author: kev.Ameda
 */
public class Question3_MakeZeros {


    public static void main(String[] args) {

        int[] input1 = {1, 2, 3};
        System.out.println("Input: [1, 2, 3] => Result: " + makeZerosExceptFirst(input1)); // Expected: 1

        int[] input2 = {5, 10, 8};
        System.out.println("Input: [5, 10, 8] => Result: " + makeZerosExceptFirst(input2)); // Expected: 0


        int[] input3 = {4, 8, 12, 16};
        System.out.println("Input: [4, 8, 12, 16] => Result: " + makeZerosExceptFirst(input3)); // Expected: 1


        int[] input4 = {3, 9, 12};
        System.out.println("Input: [3, 9, 12] => Result: " + makeZerosExceptFirst(input4)); // Expected: 1

        int[] input5 = {6, 9, 20};
        System.out.println("Input: [6, 9, 20] => Result: " + makeZerosExceptFirst(input5)); // Expected: 0
    }

    /*
    * checks whether it's possible to reduce all elements (except the first)
    * to 0
    *
    * @param array of positive integers
    * @return 1 if possible, 0 otherwise
    * */
    public static int makeZerosExceptFirst( int [] arr ){
        if( arr == null || arr.length == 0 ) return 0;

        int gcd = arr[0]; // greatest common divisor
        for( int i = 1; i < arr.length; i++ ){
            gcd = computeGCD(gcd,arr[i]);
        }
        return gcd == arr[0] ? 1 : 0;
    }

    /*
    * compute the greatest common divisor
    *  Hint ( GCD  of two numbers is the largest integer that divides both numbers without a remainder )
    *  Given two numbers a, b while b != 0, set a = b, set b = a%b, when b == 0 then a=GCD
    * */
    private static int computeGCD( int a , int b ){
        while(b != 0 ){
            int temp = b;
            b = a%b;
            a=temp;
        }
        return a;
    }


}
