package Leetcode_04;
/*编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。
示例 1：
输入：strs = ["flower","flow","flight"]
输出："fl"
*/
public class Solution {
    public static void main(String[] args) {
        String[]strs={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        //设第一个字符串为标记
        String s=strs[0];
        //遍历数组
        for(String string:strs){
            //当下一个字符串与标记字符串不相同时
            //StartsWith()表示是否以指定字符串为前缀
            while(!string.startsWith(s)){
                //若与标记字符串的一直没有重合则返回
                if(s.length()==0){
                    return "";
                }
                //如进入循环则标记字符串减少一个字符
                //subString获取s从0到s.length()-1位置的子字符串
                s=s.substring(0,s.length()-1);
            }
        }
        return s;

    }
}
