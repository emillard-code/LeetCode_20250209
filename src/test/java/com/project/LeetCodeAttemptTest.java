package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void countNumberOfBadPairsTest() {

        int[] nums1 = new int[]{4,1,3,3};
        assertEquals(5, LeetCodeAttempt.countNumberOfBadPairs(nums1));

        int[] nums2 = new int[]{1,2,3,4,5};
        assertEquals(0, LeetCodeAttempt.countNumberOfBadPairs(nums2));

    }

}
