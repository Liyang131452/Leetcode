package Leetcode_14;

import java.util.Scanner;

/**
给你一个非负整数 x ，计算并返回 x的算术平方根 。
由于返回类型是整数，结果只保留整数部分 ，小数部分将被舍去 。
注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
示例 1：
输入：x = 4
输出：2

 //解题思路：二分查找
**/
public class Solution {
    public static void main(String[] args) {
        int num=4;
        Scanner sc = new Scanner(System.in);
        while(true) {
            num = sc.nextInt();
            System.out.println(mySqrt(num));
        }
    }
    static int mySqrt(int x) {
        if(0==x){
            return 0;
        }
        if(1==x)
        {
            return 1;
        }
        //因为算术平方根肯定小于本身的一半，取整后为小于等于
        int left =0,right=x/2;
        while(left<right){
            int mid = left + (right - left + 1) / 2;
           // int mid = left +(right-left)/2;求2的算数平方根时出现死循环
            if(mid>x/mid){
                right=mid-1;
            }else if(mid==x/mid){
                return mid;
            }else {
                left =mid;
            }

        }
        return left;
    }
}
