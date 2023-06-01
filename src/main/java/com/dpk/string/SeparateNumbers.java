package com.dpk.string;

public class SeparateNumbers {

    public static void separateNumbers(String s) {
        String first = findFirst(s);
        if(first == null) {
            System.out.println("NO");
            return;
        }

        int wordLength = first.length();

        for(int i=0; i< s.length()/wordLength - wordLength; i = i + wordLength) {
            String s1 = s.substring(i, i + wordLength);
            int num1 = Integer.parseInt(s1);

            int nextNum = num1 +1;
            wordLength = ("" + nextNum).length();

            String s2 = s.substring(i + wordLength, i + 2 * wordLength);
            int num2 = Integer.parseInt(s2);

            if(num2 - num1 != 1) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES " + first);

    }

    private static String findFirst(String s) {
        for(int i=1; i < s.length()/i; i++) {
            String first = s.substring(0, i);
            String second = s.substring(i, i + first.length());
            if(Integer.parseInt(first) + 1 == Integer.parseInt(second)) {
                return first;
            }
        }

        return null;
    }

    static String reverseWords(String S)
    {
        // code here
        String[] words = S.split("\\.");
        StringBuilder sb = new StringBuilder();

        for(int i=words.length-1; i>= 0; i--) {
            if(i == words.length-1) {
                sb.append(words[i]);
            } else {
                sb.append(".").append(words[i]);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("i.like.this.program.very.much"));
    }
}
