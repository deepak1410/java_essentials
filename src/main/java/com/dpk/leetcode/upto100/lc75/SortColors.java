package com.dpk.leetcode.upto100.lc75;

public class SortColors {

    public void sortColors(int[] nums) {
        int red = 0; // Represents index for 0
        int white = 0; // Represents index for 1
        int blue = nums.length -1; // Represents index for 2

        while(red <= white && white <= blue) {
            if(nums[white] ==0) {
                // swap with Red
                swap(nums, red, white);
                red++;
                white++;
            } else if(nums[white] == 1) {
                white++;
            } else if(nums[white] == 2) {
                // swap with blue
                swap(nums, white, blue);
                blue--;
            }
        }

    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
