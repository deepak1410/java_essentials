package com.dpk.leetcode.lc78;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

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