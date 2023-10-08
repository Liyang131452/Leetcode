package Leetcode_12;

/*
给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
你可以假设除了整数 0 之外，这个整数不会以零开头。

示例 1：
输入：digits = [1,2,3]
输出：[1,2,4]
解释：输入数组表示数字 123。

难点：9+1==10，需要进位，如果数为：999 ===> 999+1==1000,需要开辟新数组
*/
public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nums = plusOne(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }
    }

    static int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                for (int j = i + 1; j < length; ++j) {
                    digits[j] = 0;
                }
                return digits;
            }
        }
        int[] newarr = new int[length + 1];
        newarr[0] = 1;
        return newarr;
    }
}
