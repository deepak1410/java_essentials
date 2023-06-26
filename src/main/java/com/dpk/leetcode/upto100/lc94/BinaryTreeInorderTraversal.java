package com.dpk.leetcode.upto100.lc94;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversal(result, root);
        return result;
    }

    private void inorderTraversal(List<Integer> result, TreeNode node) {
        if(node != null) {
            inorderTraversal(result, node.left);
            result.add(node.val);
            inorderTraversal(result, node.right);
        }
    }

    public static void main(String[] args) {

    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
