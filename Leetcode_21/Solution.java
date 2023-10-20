package Leetcode_21;

import javax.swing.*;

/*
给定一个二叉树 root ，返回其最大深度。
二叉树的 最大深度 是指从根节点到最远叶子节点的最长路径上的节点数。
*/
public class Solution {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        System.out.println(maxDepth(buildTree()));
    }
    static int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }else{
            int leftHeight=maxDepth(root.left);
            int rightHeight=maxDepth(root.right);
            return Math.max(leftHeight,rightHeight)+1;
        }
    }


    static TreeNode buildTree() {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9, null, null);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15, null, null);
        TreeNode node4 = new TreeNode(7, null, null);
        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;
        return root;
    }

}
