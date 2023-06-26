package com.dpk.leetcode.upto100.lc22;

import java.util.ArrayList;
import java.util.List;

public class ParenthesesGenerator {
    int max;

    public List<String> generateParenthesis(int n) {
        max = n;
        List<String> result = new ArrayList<>();
        String temp = "";
        backtrack(result, temp, 0, 0);
        return result;
    }

    private void backtrack(List<String> result, String temp, int open, int close) {
        if(temp.length() == 2*max) {
            result.add(temp);
            return;
        }

        if(open < max) {
            backtrack(result, temp + "(", open+1, close);
        }

        if(close < open) {
            backtrack(result, temp + ")", open, close+1);
        }

    }

    private void testCase1() {
        int n=2;
        List<String> parentheses = generateParenthesis(n);
        System.out.println("Number of items generated when n =2 are " + parentheses.size());
    }

    private void testCase2() {
        int n=3;
        List<String> parentheses = generateParenthesis(n);
        System.out.println("Number of items generated when n =3 are " + parentheses.size());
    }

    public static void main(String[] args) {
        ParenthesesGenerator parenthesesGenerator = new ParenthesesGenerator();
        parenthesesGenerator.testCase1();
        parenthesesGenerator.testCase2();
    }

}
