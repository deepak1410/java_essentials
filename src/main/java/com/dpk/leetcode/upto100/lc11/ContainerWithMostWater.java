package com.dpk.leetcode.upto100.lc11;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int maxArea = 0;

        while(left < right) {
            int width = right - left;
            maxArea = Math.max(maxArea, width * Math.min(height[left], height[right]));

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    private void testCase1() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = maxArea(height);
        int expectedArea = 49;
        System.out.println(expectedArea == result);
    }

    private void testCase2() {
        int[] height = {2,3,4,5,18,17,6};
        int result = maxArea(height);
        int expectedArea = 17;
        System.out.println(expectedArea == result);
    }

    public static void main(String[] args) {
        ContainerWithMostWater container = new ContainerWithMostWater();
        container.testCase1();
        container.testCase2();
    }
}
