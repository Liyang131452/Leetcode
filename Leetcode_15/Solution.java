package Leetcode_15;

import java.util.Scanner;

/*假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
示例 1：
输入：n = 2
输出：2
解释：有两种方法可以爬到楼顶。
1. 1 阶 + 1 阶
2. 2 阶*/
public class Solution {
    public static void main(String[] args) {
        int n=45;
        Scanner sc =new Scanner(System.in);
       // n=sc.nextInt();
        System.out.println(climbStairs(n));
    }
    static int climbStairs(int n) {
        /**
        超时啦，太慢啦
        if(n < 2){
            return 1;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
        **/

        //思路：斐波那契数列
        return 0;
    }
}
