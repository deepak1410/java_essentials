package com.dpk.ds.tree;

public class Tree {

    private TreeNode root;

    public void insert(int value) {
        if(root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public int min(TreeNode treeNode) {
        if(treeNode == null) {
            return Integer.MIN_VALUE;
        } else {
            return treeNode.min();
        }
    }

    public int max(TreeNode treeNode) {
        if(treeNode == null) {
            return Integer.MAX_VALUE;
        } else {
            return treeNode.max();
        }
    }

    public TreeNode get(int value) {
        TreeNode treeNode = new TreeNode(value);
        TreeNode node = treeNode.get(value);
        return node;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    public TreeNode delete(TreeNode subTreeRoot, int value) {
        if(subTreeRoot == null) {
            return null;
        }

        if(value < subTreeRoot.getData()) {
            subTreeRoot.setLchild(delete(subTreeRoot.getLchild(), value));
        } else if(value > subTreeRoot.getData()) {
            subTreeRoot.setRchild(delete(subTreeRoot.getRchild(), value));
        } else {

            // Case 1 and 2 where node has either 0 or 1 children
            if(subTreeRoot.getLchild() == null) {
                return subTreeRoot.getRchild();
            } else if(subTreeRoot.getRchild() == null) {
                return subTreeRoot.getLchild();
            }

            // Case 3 where node has exactly 2 children
            subTreeRoot.setData(subTreeRoot.getRchild().min());
            subTreeRoot.setRchild(delete(subTreeRoot.getRchild(), subTreeRoot.getData()));
        }

        return subTreeRoot;
    }

    public static void traverseInorder(TreeNode node) {
        if(node.getLchild() != null) {
            traverseInorder(node.getLchild());
        }

        System.out.print(node.getData() + ", ");

        if(node.getRchild() != null) {
            traverseInorder(node.getRchild());
        }

    }


    public static void testTraverseInOrder() {
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(28);
        tree.insert(18);
        tree.insert(32);
        tree.insert(15);
        tree.insert(20);
        tree.insert(48);
        tree.insert(35);

        traverseInorder(tree.root);
        System.out.println();

        System.out.println("Search for 18 " + tree.root.get(18));
        System.out.println("Search for 20 " + tree.root.get(20));
        System.out.println("Search for 188 " + tree.root.get(188));

        System.out.println("Min = " + tree.min(tree.root));
        System.out.println("Max = " + tree.max(tree.root));

        System.out.println("Deleting 18 ");
        tree.delete(18);
        traverseInorder(tree.root);
    }

    public static void main(String[] args) {
        testTraverseInOrder();
    }

}
