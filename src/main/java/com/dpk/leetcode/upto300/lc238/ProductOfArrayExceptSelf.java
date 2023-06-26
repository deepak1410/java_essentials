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

    public static void main(String[] args) {
        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();
        int[] arr = {5, 2, 4, 3, 2};
        obj.productExceptSelf(arr);
    }


}
