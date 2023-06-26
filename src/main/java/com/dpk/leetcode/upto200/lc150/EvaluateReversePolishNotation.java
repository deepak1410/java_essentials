package com.dpk.leetcode.upto200.lc150;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens) {
            if(isNotDigit(token)) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                int result = evaluate(token, num2, num1); // Order of num1 and num2 are changed due to LIFO
                stack.push(result);
            } else {
                stack.push(Integer.valueOf(token));
            }

        }
        return stack.pop();
    }

    private static Integer evaluate(String operator, Integer num1, Integer num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
        }

        throw new RuntimeException("Invalid operation");
    }

    private boolean isNotDigit(String str) {
        return str.matches("\\D");
    }

    public static void main(String[] args) {

    }
}
