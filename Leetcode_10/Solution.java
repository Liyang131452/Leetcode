package Leetcode_10;

/*
给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
请必须使用时间复杂度为 O(log n) 的算法。
示例 1:
输入: nums = [1,3,5,6], target = 5
输出: 2
解题思路：二分查找
*/
public class Solution {
    public static void main(String[] args) {
        int target = 5;
        int[] nums = {1, 3, 5, 6};
        int index = searchInsert(nums, target);
        System.out.println(index);
    }

    static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left =0,right=n-1;

        while(left<=right){
            int middle = left+((right-left)/2);
            if(nums[middle]>target){
                right=middle-1;
            } else if (nums[middle]<target) {
                left=middle+1;
            }else{
                return middle;
            }
        }
        return left;
    }
}
