package com.dpk.algorithms.recursion;

public class Palindrome {

    public static boolean isPalindrome(String text) {
        // Base case
        if(text.length() < 2) {
            return true;
        }

        if(text.charAt(0) != text.charAt(text.length()-1)) {
            return false;
        }

        // Recursive case
        return isPalindrome(text.substring(1, text.length() -1));

    }

}
