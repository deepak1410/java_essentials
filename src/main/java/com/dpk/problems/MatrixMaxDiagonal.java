package com.dpk.problems;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class MatrixMaxDiagonal {

    public Integer findMaxDiagonal(List<List<Integer>> matrix) {
        int n = matrix.size();
        TreeSet<Integer> items = new TreeSet<>();
        int column = 0;

        for(int i=0; i<n; i++) {
            List<Integer> row = matrix.get(i);

            // Reverse row
            Collections.reverse(row);
            matrix.set(i, row);

            // Find diagonal sum
            int sum = findDiagonalSum(matrix);
            items.add(sum);

            // Reverse Column
            reverseColumn(matrix, i);
            // Find diagonal sum
            sum = findDiagonalSum(matrix);
            items.add(sum);
        }

        return items.last();
    }

    private void reverseColumn(List<List<Integer>> matrix, int n) {
        for(int i =0; i < matrix.size(); i++) {
            matrix.get(i).set(matrix.get(i).get(n), matrix.get(i).get(matrix.size() -n));
        }
    }

    private int findDiagonalSum(List<List<Integer>> matrix) {
        int sum = 0;
        for(int i = 0; i< matrix.size(); i++) {
            sum = sum + matrix.get(i).get(i);
        }
        return sum;
    }

    public int[] twoSum(int[] nums, int target) {
        int[] pair = new int[2];

        for (int i =0; i< nums.length -1; i++) {
            for(int j=1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    pair = new int[]{nums[i], nums[j]};
                }
            }
        }
        return pair;
    }


    public static void main(String[] args) {

    }
}
