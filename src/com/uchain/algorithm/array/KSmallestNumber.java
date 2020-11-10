package com.uchain.algorithm.array;

import java.util.ArrayList;

/**
 * @description leetcode 最小的k个数
 * 输入n个整数，找出其中最小的k个数。例如输入1,2,3,4,5,6,7,8，最小的四个数字为1,2,3,4
 * 思路：排从小到大排序 然后输入
 */
public class KSmallestNumber {
    public static void main(String[] args) {
        int[] arr=new int[]{};
        System.out.println(findSmallestKNumber(arr,4));
    }
    public static ArrayList<Integer> findSmallestKNumber(int[] input,int k){
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(input==null || input.length==0 || k>input.length){
            return new ArrayList<>();
        }
        for(int i=0;i<input.length-1;i++){
            for(int j=0;j<input.length-1-i;j++){
                if(input[j]>input[j+1]){
                    int temp=input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                }
            }
        }
        for(int l=0;l<k;l++){
            list.add(input[l]);
        }

        return list;
    }
}
