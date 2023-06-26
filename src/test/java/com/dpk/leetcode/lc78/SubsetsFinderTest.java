package com.dpk.leetcode.lc78;

import com.dpk.leetcode.upto100.lc78.SubsetsFinder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

class SubsetsFinderTest {

    private static SubsetsFinder subsetsFinder;

    @BeforeAll
    static void setUp() {
        subsetsFinder = new SubsetsFinder();
    }

    @Test
    void subsets() {
        int[] input = {1, 2, 3};
        List<List<Integer>> output = subsetsFinder.subsets(input);
        int[][] outputExpected = {{},{1},{2},{1,2},{3},{1,3},{2,3},{1,2,3}};

    }
}