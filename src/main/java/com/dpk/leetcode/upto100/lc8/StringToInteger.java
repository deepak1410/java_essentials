package com.dpk.leetcode.upto100.lc8;

/**
 * Problem LeetCode-8 String to Integer (atoi)
 * <a href="https://leetcode.com/problems/string-to-integer-atoi/">...</a>
 */
public class StringToInteger {

    public int myAtoi(String s) {

        s = s.trim();
        boolean isNegative = s.startsWith("-");
        int number = 0;
        String numberStr = "";
        s = (s.startsWith("-") || s.startsWith("+")) ? s.substring(1) : s;

        for(int i=0; i<s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {

                numberStr += String.valueOf(s.charAt(i));
                try {
                    number = Integer.parseInt(numberStr);
                } catch(NumberFormatException ex) {
                    return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
            } else {
                break;
            }
        }

        number = (number > 0 && isNegative) ? Math.negateExact(number) : number;
        return number;
    }

    public static void main(String[] args) {

    }
}
