package com.dpk.ds.tree;

public class TreeNode {

    private int data;
    private TreeNode lchild;
    private TreeNode rchild;

    public TreeNode(int data, TreeNode lchild, TreeNode rchild) {
        this.data = data;
        this.lchild = lchild;
        this.rchild = rchild;
    }

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLchild() {
        return lchild;
    }

    public void setLchild(TreeNode lchild) {
        this.lchild = lchild;
    }

    public TreeNode getRchild() {
        return rchild;
    }

    public void setRchild(TreeNode rchild) {
        this.rchild = rchild;
    }

    public void insert(int value) {
        if (value == data) {
            return;
        }

        if(value < data) {
            if(lchild == null) {
                lchild = new TreeNode(value);
            } else {
                lchild.insert(value);
            }
        } else {
            if(rchild == null) {
                rchild = new TreeNode(value);
            } else {
                rchild.insert(value);
            }
        }
    }

    public TreeNode get(int value) {
        if(value == data) {
            return this;
        } else if(value < data) {
            if(lchild != null) {
                return lchild.get(value);
            }
        } else {
            if(rchild != null) {
                return rchild.get(value);
            }
        }

        return null;
    }

    public int min() {
        if(lchild == null) {
            return data;
        } else {
            return lchild.min();
        }
    }

    public int max() {
        if(rchild == null) {
            return data;
        } else {
            return rchild.max();
        }
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }
}
