package com.dpk.algorithms.bruteforce;

public class LongestCommonSubstring {

    public static int longestCommonSubstrLength(String s1, String s2) {
        return longestCommonSubstrLengthRec(s1, s2, 0, 0, 0);
    }

    public static int longestCommonSubstrLengthRec(String s1, String s2, int i, int j, int count) {
        if(i == s1.length() || j == s2.length()) {
            return count;
        }

        if(s1.charAt(i) == s2.charAt(j)) {
            count = longestCommonSubstrLengthRec(s1, s2, i+1, j+1, count +1);
        }

        int c1 = longestCommonSubstrLengthRec(s1, s2, i+1, j, 0);
        int c2 = longestCommonSubstrLengthRec(s1, s2, i, j+1, 0);

        return Math.max(count, Math.max(c1, c2));
    }

    public static void main(String[] args) {
        String s1 = "0abc321";
        String s2 = "123abcdef";
        System.out.println(longestCommonSubstrLength(s1, s2));
    }
}
