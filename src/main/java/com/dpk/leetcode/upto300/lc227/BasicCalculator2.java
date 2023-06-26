package com.dpk.leetcode.upto300.lc227;

import java.util.Stack;

public class BasicCalculator2 {

    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int currNum = 0;
        char op = '+';

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                currNum = 10 * currNum + (ch - '0');
            }

            if(!Character.isDigit(ch) && ch != ' ' || i == s.length() -1) {
                if(op == '+') {
                    stack.push(currNum);
                } else if(op == '-') {
                    stack.push(-currNum);
                } else if(op == '*') {
                    stack.push(stack.pop() * currNum);
                } else if(op == '/') {
                    stack.push(stack.pop() / currNum);
                }

                op = ch;
                currNum = 0;
            }
        }

        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }

    private void testCase1() {
        String s = "3+2*2";
        int expectedResult = 7;
        int actualResult = calculate(s);
        System.out.println("Test result = " + (expectedResult == actualResult));
    }

    private void testCase2() {
        String s = "42";
        int expectedResult = 42;
        int actualResult = calculate(s);
        System.out.println("Test result = " + (expectedResult == actualResult));
    }

    public static void main(String[] args) {
        BasicCalculator2 basicCalculator2 = new BasicCalculator2();
      //  basicCalculator2.testCase1();
        basicCalculator2.testCase2();
    }
}
