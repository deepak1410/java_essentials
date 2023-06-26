package com.dpk.leetcode.upto100.lc69;

public class SquareRootFinder {

    public int mySqrt(int x) {
        for(long i=0; i<= x; i++) {
            if(i * i == x) {
                return (int)i;
            }

            if(i*i > x) {
                return (int)(i-1);
            }
        }

        return x;
    }
}
