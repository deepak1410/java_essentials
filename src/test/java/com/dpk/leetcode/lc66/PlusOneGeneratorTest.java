package com.dpk.leetcode.lc66;

import com.dpk.leetcode.upto100.lc66.PlusOneGenerator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneGeneratorTest {

    private static PlusOneGenerator plusOneGenerator;

    @BeforeAll
    public static void beforeAll() {
        plusOneGenerator = new PlusOneGenerator();
    }

    @Test
    void plusOne() {
        int[] digits = {1,2,3};
        int[] expectedOutput = {1,2,4};

        int[] output = plusOneGenerator.plusOne(digits);
        assertArrayEquals(expectedOutput, output);
    }
}