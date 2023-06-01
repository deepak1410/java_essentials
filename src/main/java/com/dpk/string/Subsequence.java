package com.dpk.string;

public class Subsequence {

    public static String findSubsequence(String text, String sequence) {
        int textIndex = 0;
        int seqIndex = 0;
        String found = "NO";

        while(textIndex < text.length() && seqIndex < sequence.length()) {
            if(sequence.charAt(seqIndex) == text.charAt(textIndex)) {
                seqIndex++;
                textIndex++;
                if(seqIndex == sequence.length()) {
                    found = "YES";
                    break;
                }
            } else {
                textIndex++;
            }
        }

        return found;
    }


    public static void main(String[] args) {
        System.out.println(findSubsequence("knarrekcah", "hackerrank"));
        System.out.println(findSubsequence("hackerrank", "hackerrank"));
        System.out.println(findSubsequence("hackeronek", "hackerrank"));
        System.out.println(findSubsequence("abcdefghijklmnopqrstuvwxyz", "hackerrank"));
        System.out.println(findSubsequence("rhackerank", "hackerrank"));
        System.out.println(findSubsequence("ahankercka", "hackerrank"));
        System.out.println(findSubsequence("hacakaeararanaka", "hackerrank"));
        System.out.println(findSubsequence("hhhhaaaaackkkkerrrrrrrrank", "hackerrank"));
        System.out.println(findSubsequence("crackerhackerknar", "hackerrank"));
        System.out.println(findSubsequence("hhhackkerbanker", "hackerrank"));
    }
}
