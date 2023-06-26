package com.dpk.leetcode.upto100.lc13;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    private static Map<Character, Integer> symbolValues = new HashMap<>();

    static {
        symbolValues.put('I', 1);
        symbolValues.put('V', 5);
        symbolValues.put('X', 10);
        symbolValues.put('L', 50);
        symbolValues.put('C', 100);
        symbolValues.put('D', 500);
        symbolValues.put('M', 1000);
    }

    public int romanToInt(String s) {

        // Create a stack and add items to it
        Deque<Character> stack = new ArrayDeque<>();
        for (char aChar : s.toCharArray()) {
            stack.push(aChar);
        }

        int number = 0;

        // Iterate through the stack and find the sum of items
        while (!stack.isEmpty()) {
            Character top = stack.pop();

            if(!stack.isEmpty()) {
                Character previous = stack.peek();
                if(symbolValues.get(top) <= symbolValues.get(previous)) {
                    number += symbolValues.get(top);
                } else {
                    Character currentTop = stack.pop();
                    number += symbolValues.get(top) - symbolValues.get(currentTop);
                }
            } else {
                number += symbolValues.get(top);
            }
        }

        return number;
    }

    private void testCase1() {
        String s = "III";
        int expectedOutput = 3;
        int result = romanToInt(s);
        System.out.println("Result=" + result + ", Test Passed =" + (expectedOutput == result));
    }

    private void testCase2() {
        String s = "LVIII";
        int expectedOutput = 58;
        int result = romanToInt(s);
        System.out.println("Result=" + result + ", Test Passed =" + (expectedOutput == result));
    }

    private void testCase3() {
        String s = "MCMXCIV";
        int expectedOutput = 1994;
        int result = romanToInt(s);
        System.out.println("Result=" + result + ", Test Passed =" + (expectedOutput == result));
    }


    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        // Run test cases
        romanToInteger.testCase1();
        romanToInteger.testCase2();
        romanToInteger.testCase3();
    }
}
