package com.uchain.algorithm;

import java.util.HashMap;

/**
 * 求无重复字符的最长子串
 * 例：输入abcabcbb
 * 输出：3
 * 解释：因为无重复字符的最长子串是“abc”，所以其长度为3
 */
public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthLongestSubString("abcabcaab"));
    }
    /**
     * 解题思路：
     * 方法：滑动窗口方法解决
     *
     */
    public static int lengthLongestSubString(String str){
        if(str.length()==0)
        return 0;

        HashMap<Character,Integer> map=new HashMap<Character, Integer>();
        int max=0,left=0;

        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                left=Math.max(left,map.get(str.charAt(i))+1);
            }
            map.put(str.charAt(i),i);
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}
