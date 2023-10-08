package Leetcode_20;

/*
给你一个二叉树的根节点 root ， 检查它是否轴对称。
*/
public class Solution {
    static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode right, TreeNode left) {
            this.val = val;
            this.right = right;
            this.left = left;
        }
    }

    public static void main(String[] args) {
        TreeNode root = buildTree();
        System.out.println(isSymmetric(root));
    }

    static TreeNode buildTree() {

        TreeNode root = new TreeNode(1);
        TreeNode node0 = new TreeNode(2);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(3);
        root.left = node0;
        root.right = node1;
        node0.left = node2;
        node0.right = node3;
        node1.left = node4;
        node1.right = node5;
        return root;
    }

    static boolean isSymmetric(TreeNode root) {
        //判断是否为空 ，若为空则应认为是轴对称二叉树
        if(root==null){
            return true;
        }
        //不为空则判断左右子树是否对称
        return  dfs(root.left,root.right);
    }
    static boolean dfs(TreeNode left,TreeNode right){
        /*
        终止条件：左右子树为空、一个为空另一个非空、两者的值不相等
        */
        if(left==null&&right==null){
            return true;
        }
        if(left==null||right==null){
            return false;
        }
        if(left.val!= right.val){
            return false;
        }
        //若不满足上述条件，则递归判断：
        // 左节点的左孩子 与 右节点的右孩子
        // 左节点的右孩子 与 右节点的左孩子
        //时刻谨记为   轴对称！
        return dfs(left.left,right.right)&&dfs(left.right,right.left);
    }
}
