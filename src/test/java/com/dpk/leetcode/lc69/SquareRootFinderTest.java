package com.dpk.leetcode.lc69;

import com.dpk.leetcode.upto100.lc69.SquareRootFinder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SquareRootFinderTest {

    private static SquareRootFinder squareRootFinder;

    @BeforeAll
    static void setUp() {
        squareRootFinder = new SquareRootFinder();
    }

    @ParameterizedTest
    @CsvSource({
            "3, 1",
            "8, 2",
            "4, 2",
            "16, 4",
            "0, 0",
            "2, 1"
    })
    void testSqrtOn3(int number, int sqrt) {
        int result = squareRootFinder.mySqrt(number);
        assertEquals(sqrt, result);
    }
}