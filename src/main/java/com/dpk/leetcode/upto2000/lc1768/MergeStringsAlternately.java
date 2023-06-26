package com.dpk.leetcode.upto2000.lc1768;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        return mergeAlternately(word1, word2, new StringBuilder(), 0);
    }

    public String mergeAlternately(String word1, String word2, StringBuilder mergedWord, int index) {
        if(word1.length() <= index && word2.length() <= index) {
            return mergedWord.toString();
        } else if (word1.length() <= index) {
            return mergedWord.append(word2.substring(index)).toString();
        } else if(word2.length() <= index) {
            return mergedWord.append(word1.substring(index)).toString();
        }

        return mergeAlternately(word1, word2, mergedWord.append(word1.charAt(index)).append(word2.charAt(index)), index+1);
    }

    private void testCase1() {
        String word1 = "abc", word2 = "pqr";
        String result = mergeAlternately(word1, word2);
        String expectedResult = "apbqcr";
        System.out.println("Result=" + expectedResult.equals(result));
    }

    private void testCase2() {
        String word1 = "ab", word2 = "pqrs";
        String result = mergeAlternately(word1, word2);
        String expectedResult = "apbqrs";
        System.out.println("Result=" + expectedResult.equals(result));
    }

    public static void main(String[] args) {
        MergeStringsAlternately obj = new MergeStringsAlternately();
        obj.testCase1();
        obj.testCase2();
    }
}
