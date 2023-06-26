package com.dpk.leetcode.upto300.lc242;

import java.util.stream.Collectors;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        return getSortedString(s).equals(getSortedString(t));
    }

    private String getSortedString(String s) {
        return s.chars().mapToObj(c -> (char)c).map(String::valueOf).sorted().collect(Collectors.joining());
    }
}


