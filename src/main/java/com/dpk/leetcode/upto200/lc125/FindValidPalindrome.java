package com.dpk.leetcode.upto200.lc125;

public class FindValidPalindrome {

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }

        String str = sb.toString().toLowerCase();
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }

    public boolean isPalindrome_Alternative(String s) {
        int left = 0;
        int right = s.length() -1;
        s = s.toLowerCase();

        while(left < right) {
            if(!isAlphaNumeric(s.charAt(left))) {
                left++;
                continue;
            }

            if(!isAlphaNumeric(s.charAt(right))) {
                right--;
                continue;
            }

            if(s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }

        return true;
    }

    private boolean isAlphaNumeric(char ch) {
        return Character.isAlphabetic(ch) || Character.isDigit(ch);
    }

    private void testCase() {
        String s = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(s);
        boolean expectedOutcome = true;
        System.out.println("Test passes =" + (result == expectedOutcome));
    }

    public static void main(String[] args) {
        FindValidPalindrome findValidPalindrome = new FindValidPalindrome();
        findValidPalindrome.testCase();
    }
}
