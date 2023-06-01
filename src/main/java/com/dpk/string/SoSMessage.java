package com.dpk.string;

public class SoSMessage {

    public static int marsExploration(String s) {
        int maxWords = s.length()/3;
        // Start with 0 if word is multiplication of 3 else 1 for incomplete word
        int alteredCount = s.length() % 3 > 0 ? 1 : 0;

        for(int i=0; i< maxWords; i++) {
            String word = s.substring(3*i, 3*(i+1));
            if(Character.toLowerCase(word.charAt(0)) != 's') {
                alteredCount++;
            }

            if(Character.toLowerCase(word.charAt(1)) != 'o') {
                alteredCount++;
            }

            if(Character.toLowerCase(word.charAt(2)) != 's') {
                alteredCount++;
            }
        }

        return alteredCount;
    }

    public static void main(String[] args) {
        String sos1 = "SOSOOSOSOSOSOSSOSOSOSOSOSOS";
        System.out.println("Altered count=" + marsExploration(sos1));
    }
}
