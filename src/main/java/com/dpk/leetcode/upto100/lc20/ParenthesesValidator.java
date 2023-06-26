package com.dpk.leetcode.upto100.lc20;

import java.util.ArrayDeque;
import java.util.Deque;

/** Problem statement <a href="https://leetcode.com/problems/valid-parentheses/">...</a>
 */
public class ParenthesesValidator {

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char ch : s.toCharArray()) {
            if( ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else {
                // If the stack is empty then opening braces is missing
                if(stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();
                if(ch == ']' && top == '[') {
                    stack.pop();
                } else if(ch == '}' && top == '{') {
                    stack.pop();
                } else if(ch == ')' && top == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        // The stack should be empty in the end
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ParenthesesValidator pv = new ParenthesesValidator();

        String testStr1 = "(){()}[()]";
        String testStr2 = "(){(])}[()]";

        System.out.println("Checking for " + testStr1 + " validity: " + pv.isValid(testStr1));
        System.out.println("Checking for " + testStr2 + " validity: " + pv.isValid(testStr2));
    }
}
