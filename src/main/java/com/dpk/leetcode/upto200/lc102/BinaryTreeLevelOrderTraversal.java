package com.dpk.leetcode.upto200.lc102;

import com.dpk.leetcode.dto.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        // return solution1(root);
        return solution2(root);
    }

    // Solution-1: Using Recursion
    public List<List<Integer>> solution1(TreeNode root) {
        List<List<Integer>> levelOrderList = new ArrayList<>();
        if(root != null) {
            List<TreeNode> nodeList = new ArrayList<>();
            nodeList.add(root);
            generateLevel(nodeList, levelOrderList);
        }
        return levelOrderList;
    }

    private void generateLevel(List<TreeNode> nodeList, List<List<Integer>> levelOrderList) {
        List<Integer> levelValues = new ArrayList<>();
        List<TreeNode> nextTreeNodeList = new ArrayList<>();

        for(TreeNode node : nodeList) {
            if(node != null) {
                levelValues.add(node.val);
                if(node.left != null) {
                    nextTreeNodeList.add(node.left);
                }

                if(node.right != null) {
                    nextTreeNodeList.add(node.right);
                }
            }
        }

        levelOrderList.add(levelValues);
        if(!nextTreeNodeList.isEmpty()) {
            generateLevel(nextTreeNodeList, levelOrderList);
        }
    }

    // Using queue
    public List<List<Integer>> solution2(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> levelList = new ArrayList<>();

        if(root == null) {
            return levelList;
        }

        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> subList = new ArrayList<>();

            for(int i=0; i<size; i++) {
                TreeNode top = queue.poll();
                subList.add(top.val);

                if(top.left != null) {
                    queue.offer(top.left);
                }

                if(top.right != null) {
                    queue.offer(top.right);
                }
            }
            levelList.add(subList);
        }

        return levelList;
    }

}
