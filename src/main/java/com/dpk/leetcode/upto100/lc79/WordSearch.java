package com.dpk.leetcode.upto100.lc79;

public class WordSearch {

    public boolean exist(char[][] board, String word) {
        int nRow = board.length;
        int nCol = board[0].length;
        char[][] picked = new char[nRow][nCol];

        for(int i=0; i<nRow; i++) {
            for(int j=0; j<nCol; j++) {
                if(board[i][j] == word.charAt(0)) {
                    if(found(board, word, 0, picked, i, j)) {
                        return true;
                    }
                }
            }
        }

        return false;

    }

    private boolean found(char[][] board, String word, int wordIndex, char[][] picked, int rowIndex, int colIndex) {

        if(wordIndex == word.length()) {
            // Reached the end of the word
            return true;
        }

        // Add condition for base case
        if(rowIndex < 0 || colIndex < 0 || rowIndex == board.length || colIndex == board[0].length
                || picked[rowIndex][colIndex] ==1 || board[rowIndex][colIndex] != word.charAt(wordIndex)) {
            return false;
        }

        // Iterate through the board in all the directions
        picked[rowIndex][colIndex] =1;
        boolean left = found(board, word, wordIndex+1, picked, rowIndex-1, colIndex);
        boolean right = found(board, word, wordIndex+1, picked, rowIndex+1, colIndex);
        boolean up = found(board, word, wordIndex+1, picked, rowIndex, colIndex-1);
        boolean down = found(board, word, wordIndex+1, picked, rowIndex, colIndex+1);

        picked[rowIndex][colIndex] = 0;
        return left || right || up || down;
    }


}
