package com.dpk.leetcode.upto300.lc242;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        return getSortedString1(s).equals(getSortedString(t));
    }

    private String getSortedString(String s) {
        return s.chars().mapToObj(c -> (char)c).map(String::valueOf).sorted().collect(Collectors.joining());
    }

    /**
     * This method is faster than the Stream API approach as it doesn't involve Boxing and unBoxing.
     */
    private String getSortedString1(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}


