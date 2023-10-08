package Leetcode_05;

import java.util.Stack;

/*
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
有效字符串需满足：
左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
每个右括号都有一个对应的相同类型的左括号。
示例 1：
输入：s = "()"
输出：true
*/
public class Solution {
    public static void main(String[] args) {
        String s ="()";
        System.out.println(isValid(s));
    }
    static boolean isValid(String s) {
        if(s.length()%2==1){
            return false;
        }
        if(s == "" || s.length() == 0){
            return true;
        }
        Stack<Character> stack =new Stack();
        for (int i = 0; i < s.length(); i++) {
           char ch =s.charAt(i);
           if(ch=='('||ch=='['||ch=='{'){
               stack.push(ch);
           }else{
               if(stack.isEmpty()){
                   return false;
               }
               char topChar = stack.pop();
               if(ch==')'&&topChar!='('){
                   return false;
               } else if (ch==']'&&topChar!='[') {
                   return false;
               } else if (ch=='}'&&topChar!='{') {
                   return  false;
               }
           }
        }

        return stack.isEmpty();
    }
}
