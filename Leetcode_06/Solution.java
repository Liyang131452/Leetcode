package Leetcode_06;

/*
将两个升序链表合并为一个新的 升序 链表并返回。
新链表是通过拼接给定的两个链表的所有节点组成的。
输入：l1 = [1,2,4], l2 = [1,3,4]
输出：[1,1,2,3,4,4]

/**
Definition for singly-linked list.
public class ListNode {
    int val
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newNode = new ListNode();
        ListNode thisNode = newNode;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                thisNode.next=list1;
                list1=list1.next;
            }else {
                thisNode.next=list2;
                list2=list2.next;
            }
            thisNode = thisNode.next;
        }
        if(list1!=null){
            thisNode.next=list1;
        }
        if(list2!=null){
            thisNode.next=list2;
        }

        return newNode.next;
    }
}
*/
public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4};
        int[] nums2 = {1, 3, 4};

        ListNode listNode1 = CreateList(nums.length, nums);
        ListNode listNode2 = CreateList(nums2.length, nums2);
        listNode1.print();
        System.out.println();
        listNode2.print();
        System.out.println();
        ListNode listNode3 = mergeTwoLists(listNode1, listNode2);

        listNode3.print();
    }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (String.valueOf(list1.getVal()).equals("") && String.valueOf(list2.getVal()).equals("")) {
            return list1;
        }
        ListNode newNode = new ListNode();
        ListNode thisNode = newNode;
        while (list1 != null && list2 != null) {
            if (list1.getVal() < list2.getVal()) {
                thisNode.setNext(list1);
                list1 = list1.getNext();
            } else {
                thisNode.setNext(list2);
                list2 = list2.getNext();
            }
            thisNode = thisNode.getNext();
        }
        if (list1 != null) {
            thisNode.setNext(list1);
        }
        if (list2 != null) {
            thisNode.setNext(list2);
        }

        return newNode.getNext();
    }

    static ListNode CreateList(int length, int[] vals) {
        ListNode listNode = new ListNode(0);
        for (int i = 0; i < length; i++) {
            listNode.addNode(vals[i]);
        }
        return listNode;
    }

    static class ListNode {
        private int val;
        private ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        public void addNode(int val) {
            if (0 == this.val) {
                this.val = val;
            }else {
                ListNode newNode = new ListNode(val);
                if (this.next == null) {
                    this.next = newNode;
                } else {
                    this.next.addNode(val);
                }
            }
        }

        public void print() {
            System.out.print(this.val);
            if (this.next != null) {
                System.out.print(",");
                this.next.print();
            }
        }

    }
}
