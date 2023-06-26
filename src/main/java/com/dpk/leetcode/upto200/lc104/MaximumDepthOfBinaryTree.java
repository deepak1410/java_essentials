package com.dpk.leetcode.upto200.lc104;

import com.dpk.leetcode.dto.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {

        if(root == null) {
            return 0;
        }

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);
        return 1 + Math.max(lh, rh);
    }
}
