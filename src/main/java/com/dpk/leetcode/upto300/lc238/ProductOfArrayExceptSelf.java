package com.dpk.leetcode.upto300.lc238;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        Arrays.fill(ans, 1);

        // Pre-product
        int curr = 1;
        for(int i = 0; i < nums.length; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }

        // Post product
        curr = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }

    // This simple solution beats 99% on LeetCode
    public int[] productExceptSelf_WithBruteForce(int[] nums) {
        int product = 1;
        int[] results = new int[nums.length];

        for(int num : nums) {
            product *= num;
        }
        if(product != 0) {

            for(int i=0; i<nums.length; i++) {
                results[i] = product / nums[i];
            }
        } else {
            for(int i=0; i<nums.length; i++) {
                int result = 1;
                for(int j=0; j<nums.length; j++) {
                    if(i != j) {
                        result = result * nums[j];
                    }
                }
                results[i] = result;

            }
        }
        return results;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();
        int[] arr = {5, 2, 4, 3, 2};
        obj.productExceptSelf(arr);
    }


}
