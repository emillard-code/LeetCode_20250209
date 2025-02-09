package com.project.solution;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeSolution {

    public static void main(String[] args) {

        int[] nums1 = new int[]{4,1,3,3};
        System.out.println(countBadPairs(nums1));

        int[] nums2 = new int[]{1,2,3,4,5};
        System.out.println(countBadPairs(nums2));

    }

    public static long countBadPairs(int[] nums) {

        long badPairs = 0;
        Map<Integer, Integer> diffCount = new HashMap<>();

        for (int pos = 0; pos < nums.length; pos++) {

            int diff = pos - nums[pos];

            // Count of previous positions with same difference
            int goodPairsCount = diffCount.getOrDefault(diff, 0);

            // Total possible pairs minus good pairs = bad pairs
            badPairs += pos - goodPairsCount;

            // Update count of positions with this difference
            diffCount.put(diff, goodPairsCount + 1);

        }

        return badPairs;

    }

}
