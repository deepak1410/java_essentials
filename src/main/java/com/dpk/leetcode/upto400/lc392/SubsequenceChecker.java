package com.dpk.leetcode.upto400.lc392;

import com.dpk.leetcode.Solution;

public class SubsequenceChecker {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) {
            return true;
        }

        if(t.isEmpty()) {
            return false;
        }

        if(s.charAt(0) == t.charAt(0)) {
            return isSubsequence(s.substring(1), t.substring(1));
        } else {
            return isSubsequence(s, t.substring(1));
        }
    }

    /**
     * Iteration solution - A more optimised solution
     */
    public boolean isSubsequence_iteration(String s, String t) {
        int i=0, j=0, n=s.length();
        while (i<n && j<t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i==n;
    }


    public static void main(String[] args) {
        SubsequenceChecker solution = new SubsequenceChecker();
        String s = "abc", t = "ahbgdc";
        boolean seq =  solution.isSubsequence(s, t);
        System.out.println(seq);
    }
}
