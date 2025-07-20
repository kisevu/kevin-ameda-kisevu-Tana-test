package com.ameda.tana.test.Question5;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: kev.Ameda
 */
public class Question5_ClosestMinimumDistance {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 1, 4, 5, 2};
        int result = findClosestMinimumDistance(input);
        System.out.println(" Closest minimum distance: " + result);
    }

    public static int findClosestMinimumDistance( int [] nums ){
        if( nums == null || nums.length < 2 ){
            throw new IllegalArgumentException("Array should contain at least more than 2 elements.");
        }

        int min = Integer.MAX_VALUE;

        // step 1 Find the minimum value
        for( int num: nums ){
            if( num < min ){
                min = num;
            }
        }

        //step 2 collect all indices where the min value appears
        List<Integer> minIndices = new ArrayList<>();
        for( int i = 0; i < nums.length; i++ ){
            if( nums[i] == min ){
                minIndices.add(i);
            }
        }

        //step 3 find the smallest distance between adjacent min indices
        int minDistance = Integer.MAX_VALUE;
        for( int i = 1; i < minIndices.size(); i++ ){
            int distance = minIndices.get(i) - minIndices.get(i-1);
            if( distance < minDistance ){
                minDistance = distance;
            }
        }
        return minDistance;
    }

    // Time complexity : Total time : 0(n)
    // Space complexity: Total space : 0(n)
}
