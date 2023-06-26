package com.dpk.leetcode.upto100.lc10;

public class RegexMatcher {

    public boolean isMatch(String s, String p) {
        return s.matches(p);
    }


    public static void main(String[] args) {

        RegexMatcher regexMatcher = new RegexMatcher();

        // Test case-1
        String s = "aa", p = "a*";
        System.out.println(regexMatcher.isMatch(s, p));

        // Test case-2
        s = "aa";  p = "a";
        System.out.println(regexMatcher.isMatch(s, p));

        // Test case-3
        s = "ab"; p = ".*";
        System.out.println(regexMatcher.isMatch(s, p));
    }
}
