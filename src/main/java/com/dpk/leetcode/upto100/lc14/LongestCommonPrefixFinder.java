package com.dpk.leetcode.upto100.lc14;

import java.util.Arrays;

public class LongestCommonPrefixFinder {

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length -1];
        int index = 0;

        while(index < first.length() && index < last.length()) {
            if(first.charAt(index) == last.charAt(index)) {
                index++;
            } else {
                break;
            }
        }

        return  first.substring(0, index);
    }

    private void testcase1() {
        String[] strs = {"flower","flow","flight"};
        String expectedOutput = "fl";
        String result = longestCommonPrefix(strs);
        System.out.println("Result=" + result + ", Test passed=" + expectedOutput.equals(result));
    }

    private void testcase2() {
        String[] strs = {"dog","racecar","car"};
        String expectedOutput = "";
        String result = longestCommonPrefix(strs);
        System.out.println("Result=" + result + ", Test passed=" + expectedOutput.equals(result));
    }

    private void testcase3() {
        String[] strs = {"","b"};
        String expectedOutput = "";
        String result = longestCommonPrefix(strs);
        System.out.println("Result=" + result + ", Test passed=" + expectedOutput.equals(result));
    }

    private void testcase4() {
        String[] strs = {"ab", "a"};
        String expectedOutput = "a";
        String result = longestCommonPrefix(strs);
        System.out.println("Result=" + result + ", Test passed=" + expectedOutput.equals(result));
    }

    public static void main(String[] args) {
        LongestCommonPrefixFinder finder = new LongestCommonPrefixFinder();
        finder.testcase1();
        finder.testcase2();
        finder.testcase3();
        finder.testcase4();
    }
}
