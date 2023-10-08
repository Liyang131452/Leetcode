package Leetcode_11;

/*
给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个单词的长度。
单词是指仅由字母组成、不包含任何空格字符的最大子字符串。

示例 1：
输入：s = "Hello World"
输出：5
解释：最后一个单词是“World”，长度为5。
思路：反向遍历，遍历序列非空后碰到第一个空格即停止
*/
public class Solution {
    public static void main(String[] args) {
        //length==11;
        String s = "Hello World  ";
        int length = lengthOfLastWord(s);
        System.out.println(s.length());
        System.out.println(length);
    }

    static int lengthOfLastWord(String s) {
//1.StringBuffer;2.cahrAt();
        if(s==null){
            return -1;
        }
        int length=0;
        for (int i=s.length()-1 ; i >=0 ;i--) {
            if(s.charAt(i)!=' '){
                length++;
            }else if(0!=length){
                //0!=length是为了防止字符串最后出现空格误判
                break;
            }
        }
        return length;
    }
}
