package Leetcode_16;

/*
给定一个已排序的链表的头 head ，
删除所有重复的元素，使每个元素只出现一次。
返回 已排序的链表 。
输入：head = [1,1,2]
输出：[1,2]
  * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
*/

import java.util.Scanner;

public class Solution {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        Scanner sc = new Scanner(System.in);
        ListNode cur = listNode;
        System.out.println("请输入数组长度！");
        int length = sc.nextInt();
        for (int i = 1; i <= length; i++) {
            System.out.println("请输入第" + i + "个元素：");
            cur.val = sc.nextInt();
            ListNode newNode = new ListNode();
            cur.next = newNode;
            cur = cur.next;

        }

        ListNode dListNode = deleteDuplicates(listNode);
        while (dListNode.next != null) {
            System.out.println(dListNode.val);
            dListNode = dListNode.next;
        }
    }

    static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
