package Leetcode_01;
/*
给定一个整数数组 nums 和一个整数目标值 target，
请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
你可以按任意顺序返回答案。
示例 1：
输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
*/

import java.util.Scanner;

public class Solution {
    static int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i!=j&&nums[i] + nums[j] == target) {
                    a[0] = i;
                    a[1] = j;
                    break;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target;
        System.out.print("请输入目标数值：");
        target = sc.nextInt();
        System.out.print("请输入数组大小：");
        int i = sc.nextInt();
        int[] nums = new int[i];
        for (int j = 0; j < i; j++) {
            System.out.print("请输入第"+(j+1)+"个数字：");
            nums[j] = sc.nextInt();
        }
        int[] sum = twoSum(nums, target);
        for (int j = 0; j < sum.length; j++) {
            System.out.println(sum[j]);
        }
    }
}
