package com.dpk.leetcode.upto100.lc36;

import java.util.HashSet;
import java.util.Set;

public class SudokuValidator {

    public boolean isValidSudoku(char[][] board) {

        // Check for each row
        for(int i=0; i< board.length; i++) {
            boolean result = isValidSegment(board, i, i+1, 0, board.length);
            if(!result) {
                return false;
            }
        }

        // Check for each column
        for(int i=0; i< board.length; i++) {
            boolean result = isValidSegment(board, 0, board.length, i, i+1);
            if(!result) {
                return false;
            }
        }

        // Check for each 3x3 matrix
        for(int i=0; i< board.length/3; i++) {
            for(int j =0; j< board.length/3; j++) {
                boolean result = isValidSegment(board, 3 * i, 3 * (i+1), 3 * j, 3 * (j+1));
                if(!result) {
                    return false;
                }
            }
        }

        return true;

    }

    private boolean isValidSegment(char[][] board, int rowStart, int rowEnd, int columnStart, int columnEnd) {
        Set<Character> set = new HashSet<>();
        for(int i=rowStart; i< rowEnd; i++) {
            for(int j=columnStart; j< columnEnd; j++) {
                char ch = board[i][j];
                if(set.contains(ch) && ch != '.') {
                    return false;
                } else {
                    set.add(ch);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        SudokuValidator sv = new SudokuValidator();

        // Valid
        char[][] board =
                        {{'5','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};

        // Invalid due to duplication on row
        char[][] board2 =
                        {{'5','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','9','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};

        // Invalid due to duplication on column
        char[][] board3 =
                        {{'5','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','8','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};

        // Invalid due to duplication in 3 x 3 matrix
        char[][] board4 =
                        {{'5','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','8'}
                        ,{'.','.','.','.','8','.','.','7','9'}};


        System.out.println("Validity of " + board + " = " + sv.isValidSudoku(board));
        System.out.println("Validity of " + board2 + " = " + sv.isValidSudoku(board2));
        System.out.println("Validity of " + board3 + " = " + sv.isValidSudoku(board3));
        System.out.println("Validity of " + board4 + " = " + sv.isValidSudoku(board4));

    }

}
