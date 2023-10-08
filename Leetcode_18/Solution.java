package Leetcode_18;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
输入：root = [1,null,2,3]
输出：[1,3,2]
*/
public class Solution {
    //WHITE & GRAY 常量用来标记节点是否被访问。WHITE:已经被访问、GRAY：尚未被访问
    private static final int WHITE = 0;
    private static final int GRAY = 1;
    //中序遍历的结果
    static List<Integer> result = new ArrayList<>();

    //用于存储节点和访问状况，本质栈
    static class StackNode {
        int color;
        TreeNode node;

        public StackNode(int color, TreeNode node) {
            this.color = color;
            this.node = node;
        }
    }

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
        TreeNode treeNode2 = new TreeNode(3, null, null);
        TreeNode treeNode1 = new TreeNode(2, treeNode2, null);
        TreeNode root = new TreeNode(1, null, treeNode1);
        List<Integer> integers = inorderTraversal(root);
        System.out.println(integers);
    }

    static List<Integer> inorderTraversal(TreeNode root) {
        //1.判断传入的二叉树是否为空，如果是空，直接返回result,返回结果：[]
        if (root == null) {
            return result;
        }
        /*2.如果非空：
         * 分析：中序遍历：根节点在中间位置，最后结果为：左、中、右
         * 如果使用堆栈的方式来进行中序遍历，则需要以：右、中、左的顺序进行压栈
         */
        //定义存放节点的栈
        Stack<StackNode> treeNode = new Stack<StackNode>();
        //根节点压栈，标记为未访问
        treeNode.push(new StackNode(WHITE, root));
        while (!treeNode.empty()) {
            //取出栈顶元素
            StackNode current = treeNode.pop();
            //取出节点为空，继续判断剩余节点
            if (current.node == null) {
                continue;
            }
            //如果节点状态未访问，则按照右、中、左的顺序进行一次压栈
            if (current.color == WHITE) {
                treeNode.push(new StackNode(WHITE, current.node.right));
                treeNode.push(new StackNode(GRAY, current.node));
                treeNode.push(new StackNode(WHITE, current.node.left));
            } else {
                //当节点已经被访问时，取出节点的值，将其放入结果集中。
                result.add(current.node.val);
            }
        }

        return result;
    }
}