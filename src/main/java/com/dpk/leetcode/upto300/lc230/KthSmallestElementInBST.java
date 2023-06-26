package com.dpk.leetcode.upto300.lc230;

import com.dpk.leetcode.dto.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInBST {

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> result = new ArrayList<>();
        inorderTraversal(root, k, result);
        return result.get(k-1);
    }

    private void inorderTraversal(TreeNode node, int k, List<Integer> nodeValues) {
        if(node != null && nodeValues.size() <= k) {
            inorderTraversal(node.left, k, nodeValues);
            nodeValues.add(node.val);
            inorderTraversal(node.right, k, nodeValues);
        }

    }
}
