package com.dpk.leetcode.upto100.lc54;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        if(matrix.length == 0) {
            return result;
        }

        int rowStart = 0;
        int rowEnd = matrix.length -1;
        int colStart = 0;
        int colEnd = matrix[0].length -1;

        addItems(result, matrix, rowStart, rowEnd, colStart, colEnd);
        return result;
    }

    private void addItems(List<Integer> result, int[][] matrix, int rowStart, int rowEnd, int colStart, int colEnd) {
        // Go right
        if(rowStart <= rowEnd && colStart <= colEnd) {
            for(int i=colStart; i<=colEnd; i++) {
                result.add(matrix[rowStart][i]);
            }
            rowStart++;
        }


        // Go down
        if(rowStart <= rowEnd && colStart <= colEnd) {
            for(int i=rowStart; i<=rowEnd; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;
        }


        // Go left
        if(rowStart <= rowEnd && colStart <= colEnd) {
            for(int i= colEnd; i>=colStart; i--) {
                result.add(matrix[rowEnd][i]);
            }
            rowEnd--;
        }


        // Go up
        if(rowStart <= rowEnd && colStart <= colEnd) {
            for(int i=rowEnd; i>=rowStart; i--) {
                result.add(matrix[i][colStart]);
            }
            colStart++;
        }

        if(rowEnd >= rowStart && colEnd >= colStart) {
            addItems(result, matrix, rowStart, rowEnd, colStart, colEnd);
        }
    }
}
