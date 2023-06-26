package com.dpk.leetcode.upto200.lc108;

import com.dpk.leetcode.dto.TreeNode;

public class SortedArrayToBSTCreation {

    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums, 0, nums.length -1);
    }

    public TreeNode createBST(int[] nums, int left, int right) {
        if(right < left) {
            return null;
        }

        int mid = (left + right) / 2;

        TreeNode node = new TreeNode(nums[mid]);
        node.left = createBST(nums, left, mid -1);
        node.right = createBST(nums, mid+1, right);
        return node;
    }


}
