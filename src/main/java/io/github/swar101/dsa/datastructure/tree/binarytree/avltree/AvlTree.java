package io.github.swar101.dsa.datastructure.tree.binarytree.avltree;

public class AvlTree {
    // I think I'll do search at first
    public TreeNode insertIteratively(int val, TreeNode root) {
        if (root == null) return new TreeNode(val);
        TreeNode node = root;

        TreeNode parent = null;
        while (node != null) {
            parent = node;

            if (val < node.val) {
                node = node.left;
            } else {
                node = node.right;
            }
        }

        if (val < parent.val) {
            parent.left = new TreeNode(val);
        } else {
            parent.right = new TreeNode(val);
        }

        return root;
    }

    public TreeNode insertRecursively(int val, TreeNode root) {
        if (root == null) return new TreeNode(val);

        if (val > root.val) {
            root.right = insertRecursively(val, root.right);
        }
        if (val < root.val) {
            root.left = insertRecursively(val, root.left);
        }

        return root;
    }

    public boolean searchRecursively(int val, TreeNode root) {
        if (root == null) return false;

        if (root.val == val) return true;

        if (val < root.val) return searchRecursively(val, root.left);
        else return searchRecursively(val, root.right);
    }

    public boolean searchIteratively(int val, TreeNode root) {
        if (root == null) return false;
        if (root.val == val) return true;

        while (root != null) {
             if (val < root.val)
                root = root.left;
            else
                root = root.right;
        }

        return false;
    }

    private int calculateBalancingFactor(TreeNode node) {
        if (node.left == null && node.right == null)
            return 0;
        else if (node.right == null)
            return node.left.height;
        else if (node.left == null)
            return -node.right.height;
        else
            return node.left.height - node.right.height;
    }
}