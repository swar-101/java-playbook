package io.github.swar101.dsa.datastructure.tree.binarytree.traversal;//package org.swar101.dsa.datastructure.tree.binarytree.traversal;
//
//import org.swar101.dsa.datastructure.tree.binarytree.TreeNode;
//
//public class RecursiveTraversal implements TreeTraversal {
//
//    @Override
//    public void preorder(TreeNode root) {
//        if (root == null) return;
//        System.out.print(root.val + " ");
//        preorder(root.left);
//        preorder(root.right);
//    }
//
//    @Override
//    public void inorder(TreeNode root) {
//        if (root == null) return;
//        inorder(root.left);
//        System.out.print(root.val + " ");
//        inorder(root.right);
//    }
//
//    @Override
//    public void postorder(TreeNode root) {
//        if (root == null) return;
//        postorder(root.left);
//        postorder(root.right);
//        System.out.print(root.val + " ");
//    }
//}