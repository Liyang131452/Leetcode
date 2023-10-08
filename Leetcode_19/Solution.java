package Leetcode_19;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
输入：p = [1,2,3], q = [1,2,3]
输出：true
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
        TreeNode rootP=buildTree();
        TreeNode rootQ=buildTree();
        System.out.println(isSameTree(rootP, rootQ));
    }
    static TreeNode buildTree(){
        TreeNode treeNode2 = new TreeNode(3, null, null);
        TreeNode treeNode1 = new TreeNode(2, null, null);
        TreeNode root = new TreeNode(1, treeNode1, treeNode2);
        return root;
    }

    static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }else if (p.val!=q.val){
            return false;
        }else {
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }


    }
}
