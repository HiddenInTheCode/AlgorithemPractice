package com.uchain.algorithm.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * 给定一个数组和一个整数，如果数组里的任意两个元素的值的和和这个整数相同，
 * 则记录这两个数的下标并返回。
 */
public class NumPlus {
    public static void main(String[] args) {
        int result[]=numplus(new int[]{2,7,11,15},9);
        int result2[]=numplus2(new int[]{2,7,11,15},9);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));
    }

    /**
     * 第一种解法  使用遍历数组的值的方式找到题目对应的下标
     * 时间复杂度O(N^2) ,空间复杂度O(1)
     * @param num
     * @param target
     * @return
     */
    public static int[] numplus(int[] num,int target){
        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                if((num[i]+num[j])==target){
                    return new int[]{i,j};
                }
            }
        }

        return null;
    }

    /**
     * 使用哈希表解题
     * 时间复杂度O(N),空间复杂度O(N)
     * @param num
     * @param target
     * @return
     */
    public static int[] numplus2(int[] num,int target){
        Map<Integer,Integer> hashtable=new HashMap<Integer,Integer>();
        for(int i=0;i<num.length;i++){
            if(hashtable.containsKey(target-num[i])){
                return new int[]{hashtable.get(target-num[i]),i};

            }
            hashtable.put(num[i],i);
        }
        return new int[0];
    }
}
