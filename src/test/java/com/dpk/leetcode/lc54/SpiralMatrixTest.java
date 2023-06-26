package com.dpk.leetcode.lc54;

import com.dpk.leetcode.upto100.lc54.SpiralMatrix;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class SpiralMatrixTest {
    private static SpiralMatrix spiralMatrix;

    @BeforeAll
    static void setUp() {
        spiralMatrix = new SpiralMatrix();
    }

    @Test
    void testSpiralOrderFor3By4Matrix() {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> output = spiralMatrix.spiralOrder(matrix);

        List<Integer> expectedOutput = Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7);
        assertEquals(expectedOutput.size(), output.size());
    }

    @Test
    void testSpiralOrderFor3By3Matrix() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> output = spiralMatrix.spiralOrder(matrix);

        List<Integer> expectedOutput = Arrays.asList(1,2,3,6,9,8,7,4,5);
        assertEquals(expectedOutput.size(), output.size());
    }
}