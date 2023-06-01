package com.dpk.string;

public class StringChallenge {

    //1.
    public static int getWordCount(String sentence) {
        if(sentence == null) {
            return 0;
        }

        return (int) sentence.chars().filter(Character::isUpperCase).count() +1;
    }

    public static void testCamelCaseWordCount(String s) {
        String sentence = "helloWorldWelcomeToJavaWorld";
        System.out.println("words = " + getWordCount(sentence));
    }

    public static int findMinCharRequired(String password) {
        int upperCase = 0;
        int lowerCase = 0;
        int digits = 0;
        int specialChars = 0;

        String specialCharsStr = "!@#$%^&*()-+";

        for(int i =0; i < password.length(); i++) {
            Character ch = password.charAt(i);
            if(Character.isDigit(ch)) {
                digits++;
            } else if(Character.isUpperCase(ch)) {
                upperCase++;
            } else if(Character.isLowerCase(ch)) {
                lowerCase++;
            } else if(specialCharsStr.contains(ch.toString())) {
                specialChars++;
            }
        }

        int missingCount = 0;
        missingCount = upperCase ==0 ? missingCount+1: missingCount;
        missingCount = lowerCase ==0 ? missingCount+1: missingCount;
        missingCount = digits ==0 ? missingCount+1: missingCount;
        missingCount = specialChars ==0 ? missingCount+1: missingCount;

        missingCount = Math.max(missingCount, 6 - password.length());

        return missingCount;
    }

    public static void testString(String s) {
        System.out.println(s.substring(0, 1));
    }



    public static void main(String[] args) {
        testString("test");
    }
}
