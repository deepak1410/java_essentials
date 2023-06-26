package com.dpk.leetcode.upto100.lc5;

public class LongestPalindromeSubstring {

    private String palindrome ="";
    private int longest = 0;

    public String longestPalindrome(String s) {
        for(int i=0; i<s.length(); i++){
            expandPalindrome(s, i, i);
            expandPalindrome(s, i, i+1);
        }
        return palindrome;
    }

    private void expandPalindrome(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            int currentLength = right - left + 1;
            if(currentLength > longest){
                longest = currentLength;
                palindrome = s.substring(left, right +1);
            }
            left--;
            right++;
        }
    }

    public static void main(String[] args) {
        LongestPalindromeSubstring lps = new LongestPalindromeSubstring();
        String testString = "cbbd";
        String palindromeSubstring = lps.longestPalindrome(testString);
        System.out.println("Palindrome substring =" + palindromeSubstring);

    }

}
