package com.dpk.algorithms.bruteforce;

public class StringInterleaving {

    public static boolean findSI(String m, String n, String p) {
        return isInterleave(m, p) && isInterleave(n, p);
    }

    private static boolean isInterleave(String substr, String str) {
        for(char ch : substr.toCharArray()) {
            if(str.indexOf(ch) == -1) {
                return false;
            }
        }

        return true;
    }

    public static boolean findSIUsingBruteForce(String m, String n, String p) {
        return findSIRecursive(m, n, p, 0, 0, 0);
    }

    private static boolean findSIRecursive(String m, String n, String p, int mIndex, int nIndex, int pIndex) {
        // We have reached till the end
        if(mIndex == m.length() && nIndex == n.length() && pIndex == p.length()) {
            return true;
        }

        // We have reached till the end of p, but m and n still have items.
        if(pIndex == p.length()) {
            return false;
        }

        boolean b1 = false; boolean b2 = false;

        if(mIndex < m.length() && m.charAt(mIndex) == p.charAt(pIndex)) {
            b1 = findSIRecursive(m, n, p, mIndex+1, nIndex, pIndex+1);
        }

        if(nIndex < n.length() && n.charAt(nIndex) == p.charAt(pIndex)) {
            b2 = findSIRecursive(m, n, p, mIndex, nIndex+1, pIndex+1);
        }

        return b1 || b2;
    }


    public static void main(String[] args) {
        String m= "abd", n= "cef", p= "abcdef";
        System.out.println(findSI(m, n, p));

        boolean si = findSIUsingBruteForce(m, n, p);
        System.out.println(si);
    }
}
