package Leetcode_09;
/*
给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中
找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。
如果 needle 不是 haystack 的一部分，则返回  -1 。
示例 1：
输入：haystack = "sadbutsad", needle = "sad"
输出：0
解释："sad" 在下标 0 和 6 处匹配。
第一个匹配项的下标是 0 ，所以返回 0 。
*/
public class Solution {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int index = strStr(haystack,needle);
        System.out.println(index);
    }
    static  int strStr(String haystack, String needle) {
        if(0==haystack.length()||0==needle.length()){
            return -1;
        }
        return haystack.indexOf(needle);
    }
}
