package com.dpk.leetcode.lc405;

import com.dpk.leetcode.upto500.lc405.DecimalToHexadecimal;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DecimalToHexadecimalTest {

    private static DecimalToHexadecimal decimalToHexadecimal;

    @BeforeAll
    static void setUp() {
        decimalToHexadecimal = new DecimalToHexadecimal();
    }

    @ParameterizedTest
    @CsvSource({
            "26, 1a",
            "2000, 7d0",
            "16, 10"
    })
    void canGetValidHex(Integer decimal, String hex) {
        String expectedHex = decimalToHexadecimal.toHex(decimal);
        assertEquals(expectedHex, hex);
    }
}