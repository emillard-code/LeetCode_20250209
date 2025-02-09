package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[] nums1 = new int[]{4,1,3,3};
        System.out.println(countNumberOfBadPairs(nums1));

        int[] nums2 = new int[]{1,2,3,4,5};
        System.out.println(countNumberOfBadPairs(nums2));

    }

    // This method returns the number of bad pairs in the array.
    public static int countNumberOfBadPairs(int[] nums) {

        // int badPairs will contain the number of bad pairs in the array.
        int badPairs = 0;

        // For every index i, we iterate through the rest of the array where int j > int i.
        // This is one of the conditions necessary for a bad pair as per challenge specifications.
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                // Then for every index j, we test for the other condition necessary for a bad pair
                // as per challenge specifications. If it tested true, we increment int badPairs.
                if (j - i != nums[j] - nums[i]) { badPairs++; }

            }

        }

        // Finally, the value that int badPairs is left with is the total number of bad pairs
        // detected within the array.
        return badPairs;

    }

}
