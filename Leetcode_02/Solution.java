package Leetcode_02;
/*
给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
例如，121 是回文，而 123 不是。
示例 1：
输入：x = 121
输出：true
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean iP = isPalindrome(sc.nextInt());
        System.out.println(iP);

    }
     static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        StringBuilder stringBuilder =new StringBuilder(str);
        stringBuilder.reverse();
        String str1=stringBuilder.toString();
        if(str.equals(str1)){
            return true;
        }
        else{
            return false;
        }
     }
}
