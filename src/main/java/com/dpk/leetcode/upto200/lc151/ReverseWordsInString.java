package com.dpk.leetcode.upto200.lc151;

public class ReverseWordsInString {

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.trim().split("\\s+");

        for(int i=words.length-1; i>=0; i--) {
            sb.append(words[i]);
            if(i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public void testCase1() {
        String result = reverseWords("the sky is blue");
        System.out.println("blue is sky the".equals(result));
    }

    public void testCase2() {
        String result = reverseWords("  hello world  ");
        System.out.println("world hello".equals(result));
    }

    public static void main(String[] args) {
        ReverseWordsInString obj = new ReverseWordsInString();
       // obj.testCase1();
        obj.testCase2();
    }
}
