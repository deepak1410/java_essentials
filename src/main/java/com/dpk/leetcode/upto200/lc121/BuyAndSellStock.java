package com.dpk.leetcode.upto200.lc121;

public class BuyAndSellStock {

    /* One pass Solution */
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++) {
            minValue = Math.min(minValue, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minValue);
        }

        return maxProfit;
    }

    /* Brute force solution */
    public int maxProfitBruteForce(int[] prices) {
        int maxP = 0;
        if(prices == null || prices.length <=1) {
            return maxP;
        }

        for(int i=0; i < prices.length-1; i++) {
            for(int j=i+1; j < prices.length; j++) {
                maxP = Math.max(maxP, prices[j] - prices[i]);
            }
        }

        return maxP;
    }

    private void testCase1() {
        int[] arr = {7,1,5,3,6,4};
        int expectedMaxProfit = maxProfit(arr);
        int actualMaxProfit = 5;
        System.out.println("Test Passed= " + (expectedMaxProfit == actualMaxProfit));
    }

    private void testCase2() {
        int[] arr = {7,6,4,3,1};
        int expectedMaxProfit = maxProfit(arr);
        int actualMaxProfit = 0;
        System.out.println("Test Passed= " + (expectedMaxProfit == actualMaxProfit));
    }

    public static void main(String[] args) {
        BuyAndSellStock buyAndSellStock = new BuyAndSellStock();
        buyAndSellStock.testCase1();
        buyAndSellStock.testCase2();
    }
}
