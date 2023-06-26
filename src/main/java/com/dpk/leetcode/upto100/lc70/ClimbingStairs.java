package com.dpk.leetcode.upto100.lc70;

/**
 * Problem statement <a href="https://leetcode.com/problems/climbing-stairs/description/">LC-70</a>
 */
public class ClimbingStairs {

    public int climbStairs(int n) {

        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;

        for(int i=2; i<= n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr[n];
    }

    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        int n = 7;
        int ways = cs.climbStairs(n);
        System.out.println("Ways to reach stair of " + n + " steps=" + ways);
    }
}
