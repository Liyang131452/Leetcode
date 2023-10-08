package Leetcode_03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
字符          数值
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
例如， 罗马数字 2 写做 II ，即为两个并列的 1 。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
通常情况下，罗马数字中小的数字在大的数字的右边。 但也存在特例，例如 4 不写做 IIII，而是 IV。
数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。
同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
给定一个罗马数字，将其转换成整数。
示例 1:
输入: s = "III"
输出: 3
*/
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        System.out.println(romanToInt(s));
    }
    static int romanToInt(String s) {
       /* int num=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='I'){
                if(((i+1)<s.length())&&(s.charAt(i+1)=='V'||s.charAt(i+1)=='X')){
                    num-=1;
                }else{
                    num+=1;
                }
            } else if (s.charAt(i)=='V') {
                num+=5;
            } else if (s.charAt(i)=='X') {
                if(((i+1)<s.length())&&(s.charAt(i+1)=='L'||s.charAt(i+1)=='C')){
                    num-=10;
                }else{
                    num+=10;
                }
            } else if (s.charAt(i)=='L') {
                num+=50;
            } else if (s.charAt(i)=='C') {
                if(((i+1)<s.length())&&(s.charAt(i+1)=='D'||s.charAt(i+1)=='M')){
                    num-=100;
                }else{
                    num+=100;
                }
            } else if (s.charAt(i)=='D') {
                num+=500;
            } else if (s.charAt(i)=='M') {
                num+=1000;
            }
        }
        return num;*/
        Map<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("IV",4);
        map.put("V",5);
        map.put("IX",9);
        map.put("X",10);
        map.put("XL",40);
        map.put("L",50);
        map.put("XC",90);
        map.put("C",100);
        map.put("CD",400);
        map.put("D",500);
        map.put("CM",900);
        map.put("M",1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i+1<s.length()&&map.containsKey(s.substring(i,i+2))){
                result +=map.get(s.substring(i,i+2));
                i+=2;
            }else {
                result+=map.get(s.substring(i,i+1));
                i++;
            }
        }
        return result;










    }
}
