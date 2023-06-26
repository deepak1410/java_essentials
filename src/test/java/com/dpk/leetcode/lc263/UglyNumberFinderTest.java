package com.dpk.leetcode.lc263;

import com.dpk.leetcode.upto300.lc263.UglyNumberFinder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class UglyNumberFinderTest {

    private static UglyNumberFinder uglyNumberFinder;

    @BeforeAll
    static void setUp() {
        uglyNumberFinder = new UglyNumberFinder();
    }

    @ParameterizedTest
    @CsvSource({
            "15",
            "6",
            "10"
    })
    void isUglyTrue(int number) {
        boolean result = uglyNumberFinder.isUgly(number);
        assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource({
            "1",
            "56",
            "33"
    })
    void isUglyFalse(int number) {
        boolean result = uglyNumberFinder.isUgly(number);
        assertFalse(result);
    }
}