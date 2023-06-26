package com.dpk.leetcode.lc56;

import com.dpk.leetcode.upto100.lc56.MergeIntervals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {

    private static MergeIntervals mergeIntervals;

    @BeforeAll
    static void setUp() {
        mergeIntervals = new MergeIntervals();
    }

    @Test
    void testMerge() {
        int[][] input = {{1,4},{0,0}};
        int[][] output = mergeIntervals.merge(input);
        int[][] expectedOutput = {{0,0}, {1,4}};
        assertArrayEquals(expectedOutput, output);
    }
}