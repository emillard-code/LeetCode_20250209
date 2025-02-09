package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void countBadPairsTest() {

        int[] nums1 = new int[]{4,1,3,3};
        assertEquals(5, LeetCodeSolution.countBadPairs(nums1));

        int[] nums2 = new int[]{1,2,3,4,5};
        assertEquals(0, LeetCodeSolution.countBadPairs(nums2));

    }

}
