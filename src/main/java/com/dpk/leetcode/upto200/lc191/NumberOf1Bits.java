package com.dpk.leetcode.upto200.lc191;

import java.util.regex.Pattern;

public class NumberOf1Bits {

    public int hammingWeight(int n) {
        return (int)Pattern.compile("1").matcher(Integer.toBinaryString(n)).results().count();
    }
}
