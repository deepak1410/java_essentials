package com.dpk.algorithms.bruteforce;

/**
 * calculate how many minimum Levenshtein distance operations are required to convert one String to another.
 */
public class EditDistance {

    public static int minEditDistance(String str1, String str2, int m, int n) {

        // If first String is empty, insert all characters of second string to the first
        if(m == 0) {
            return n;
        }

        // If second String is empty, insert all the characters of first into second
        if(n == 0) {
            return m;
        }

        // Last characters are the same, ignore the last character and count for the remaining string
        if(str1.charAt(m-1) == str2.charAt(n-1)) {
            return minEditDistance(str1, str2, m-1, n-1);
        }

        // compute minimum cost for all three operations and take minimum of three values.
        int insertion = minEditDistance(str1, str2, m, n-1);
        int deletion = minEditDistance(str1, str2, m-1, n);
        int substitution = minEditDistance(str1, str2, m-1, n-1);

        return 1 + Math.min(Math.min(insertion, deletion), substitution);
    }

}
