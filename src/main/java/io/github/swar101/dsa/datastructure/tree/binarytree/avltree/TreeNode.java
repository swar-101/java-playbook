package io.github.swar101.dsa.datastructure.tree.binarytree.avltree;

public class TreeNode {

    TreeNode left;
    TreeNode right;
    int val;
    int height;

    public TreeNode(int val) {
        this.val = val;
        this.height = 1;
    }
}
