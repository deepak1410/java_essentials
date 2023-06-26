package com.dpk.leetcode.lc75;

import com.dpk.leetcode.upto100.lc75.SortColors;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortColorsTest {

    private static SortColors sortColors;

    @BeforeAll
    public static void setUp() {
        sortColors = new SortColors();
    }

    @Test
    void sortColors() {
        int[] nums = {2,0,2,1,1,0};
        int[] output = {0,0,1,1,2,2};
        sortColors.sortColors(nums);
        assertArrayEquals(output, nums);
    }

    @Test
    void sortColors1() {
        int[] nums = {2,0,1};
        int[] output = {0,1,2};
        sortColors.sortColors(nums);
        assertArrayEquals(output, nums);
    }
}