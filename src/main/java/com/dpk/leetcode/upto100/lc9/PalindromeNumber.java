package com.dpk.leetcode.upto100.lc9;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        return new StringBuilder(String.valueOf(x)).reverse().toString().equals(String.valueOf(x));
    }
}
