package com.dpk.leetcode.upto100.lc48;

public class RotateImage {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] matrix1 = new int[n][n];
        for(int row=0; row < n; row++) {
            for(int col =0; col < n; col++) {
                matrix1[row][col] = matrix[n-1-col][row];
            }
        }

        for(int row=0; row < n; row++) {
            for(int col =0; col < n; col++) {
                matrix[row][col] = matrix1[row][col];
            }
        }

    }

    public static void main(String[] args) {
        int i = -2147483648;
        System.out.println(i);
    }
}
