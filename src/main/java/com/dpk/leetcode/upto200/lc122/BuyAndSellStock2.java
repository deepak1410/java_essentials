package com.dpk.leetcode.upto200.lc122;

public class BuyAndSellStock2 {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int i = 0;
        while (i < prices.length -1) {
            // Find valley
            while (i < prices.length -1 && prices[i] >= prices[i+1]) {
                i++;
            }
            int valley = prices[i];

            // Find peak
            while(i < prices.length -1 && prices[i] <= prices[i+1]) {
                i++;
            }
            int peak = prices[i];
            maxProfit += (peak - valley);
        }
        return maxProfit;
    }

    private void testCase1() {
        int[] arr = {7,1,5,3,6,4};
        int expectedMaxProfit = maxProfit(arr);
        int actualMaxProfit = 7;
        System.out.println("Test Passed= " + (expectedMaxProfit == actualMaxProfit));
    }

    private void testCase2() {
        int[] arr = {7,6,4,3,1};
        int expectedMaxProfit = maxProfit(arr);
        int actualMaxProfit = 0;
        System.out.println("Test Passed= " + (expectedMaxProfit == actualMaxProfit));
    }

    public static void main(String[] args) {
        BuyAndSellStock2 buyAndSellStock = new BuyAndSellStock2();
        buyAndSellStock.testCase1();
        buyAndSellStock.testCase2();
    }
}
