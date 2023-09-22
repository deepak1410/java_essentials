package com.dpk.leetcode.upto100.lc44;

public class WildcardMatching {

    public static boolean isMatch(String s, String p) {
        int sIndex = 0, pIndex = 0, matchIndex = 0, starIndex = -1;

        while (sIndex < s.length()) {
            if (pIndex < p.length() && (s.charAt(sIndex) == p.charAt(pIndex) || p.charAt(pIndex) == '?')) {
                sIndex++;
                pIndex++;
            } else if (pIndex < p.length() && p.charAt(pIndex) == '*') {
                starIndex = pIndex;
                matchIndex = sIndex;
                pIndex++;
            } else if (starIndex != -1) {
                pIndex = starIndex + 1;
                matchIndex++;
                sIndex = matchIndex;
            } else {
                return false;
            }
        }

        while (pIndex < p.length() && p.charAt(pIndex) == '*') {
            pIndex++;
        }

        return pIndex == p.length();
    }

    public static void testCase1() {
        String s = "aa";
        String p = "a";
        boolean result = isMatch(s, p);
        System.out.println(result == false);
    }

    public static void testCase2() {
        String s = "aa";
        String p = "*";
        boolean result = isMatch(s, p);
        System.out.println(result == true);
    }

    public static void main(String[] args) {
        testCase1();
        testCase2();
    }
}

