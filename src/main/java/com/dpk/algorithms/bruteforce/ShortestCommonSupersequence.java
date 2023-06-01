package com.dpk.algorithms.bruteforce;

public class ShortestCommonSupersequence {

    public static int findSCSLength(String str1, String str2) {
        return findSCSLength(str1, str2, 0, 0);
    }

    public static int findSCSLength(String str1, String str2, int i, int j) {
        if (i == str1.length())
            return str2.length() - j;
        if (j == str2.length())
            return str1.length() - i;

        //if sequences have a matching character 
        if (str1.charAt(i) == str2.charAt(j))
            return 1 + findSCSLength(str1, str2, i + 1, j + 1);
        //if matching character not found
        int length1 = 1 + findSCSLength(str1, str2, i, j + 1);
        int length2 = 1 + findSCSLength(str1, str2, i + 1, j);
        //return minimum of the two 
        return Math.min(length1, length2);

    }

    public static void main(String[] args) {
        System.out.println(findSCSLength("abc", "xbc"));
        System.out.println(findSCSLength("abcdz", "bdcf"));
        System.out.println(findSCSLength("test.io", "the_test.io"));
    }


}
