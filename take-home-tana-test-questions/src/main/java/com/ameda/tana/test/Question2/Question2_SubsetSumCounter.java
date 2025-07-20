package com.ameda.tana.test.Question2;

import java.util.*;

/**
 * Author: kev.Ameda
 */
public class Question2_SubsetSumCounter {


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int target1 = 10;
        System.out.println("Target: " + target1 + ", Array: " + Arrays.toString(nums1));
        System.out.println("→ Unique combinations: " + countUniqueCombinations(nums1, target1));
        System.out.println();

        int[] nums2 = {1, 2, 4, 7, 5};
        int target2 = 17;
        System.out.println("Target: " + target2 + ", Array: " + Arrays.toString(nums2));
        System.out.println("→ Unique combinations: " + countUniqueCombinations(nums2, target2));
        System.out.println();

        int[] nums3 = {1, 1, 1, 1, 1};
        int target3 = 3;
        System.out.println("Target: " + target3 + ", Array: " + Arrays.toString(nums3));
        System.out.println("→ Unique combinations: " + countUniqueCombinations(nums3, target3));
    }

    /*
    * finds the number of unique combinations from nums[] that sum up the target value
    * @param nums Array of integers
    * @param target sum to be achieved
    * @return count of unique combinations that sum up to target
    * */
    public static  int countUniqueCombinations( int [] nums , int target ){
        Set<List<Integer>> uniqueCombinations = new HashSet<>();
        Arrays.sort(nums); // sort to remove duplicates and improve on consistency
        backtrack(nums,target,0, new ArrayList<>(),uniqueCombinations);
        return uniqueCombinations.size();
    }


    /*
    * Recursive backtracking method to explore valid combinations
    * recursive backtracking employed to explore all subsets of the array to check which one sum
    * up to target
    * */

    private static void backtrack( int [] nums ,
                                      int remaining,
                                      int start ,
                                      List<Integer> current,
                                      Set<List<Integer>> result ){
        if ( remaining == 0 ){
            result.add(new ArrayList<>(current));
            return;
        }

        for( int i = start; i<nums.length; i++ ){
            if( nums[i] > remaining ) continue;  // skip if adding nums[i] exceeds the target
            current.add(nums[i]);
            backtrack(nums,remaining-nums[i], i+1, current, result); // move to next index
            current.remove(current.size()-1); // backtrack
        }



    }

}
