package com.dpk.leetcode.upto200.lc103;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.dpk.leetcode.dto.TreeNode;

public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }

        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.push(root);
        boolean lifo = false;

        while(!linkedList.isEmpty()) {
            List<Integer> nodeList = new ArrayList<>();
            int size = linkedList.size();
            for(int i=0; i<size; i++) {
                TreeNode node = lifo ? linkedList.pollLast() : linkedList.pollFirst();
                nodeList.add(node.val);

                addItems(linkedList, node, lifo);
            }

            result.add(nodeList);
            lifo = !lifo;
        }

        return result;
    }

    private static void addItems(LinkedList<TreeNode> linkedList, TreeNode node, boolean lifo) {
        if(lifo) {
            if(node.right != null) {
                linkedList.offerFirst(node.right);
            }

            if(node.left != null) {
                linkedList.offerFirst(node.left);
            }
        } else {

            if(node.left != null) {
                linkedList.offerLast(node.left);
            }
            if(node.right != null) {
                linkedList.offerLast(node.right);
            }

        }
    }
}
