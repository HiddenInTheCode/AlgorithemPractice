package com.uchain.algorithm.array;

/**
 * @description 把数组排成最小的数
 * 例如输入数组[3,32,321]，那么数组中的数组成的最小的数就是321323
 * 思路：一次比较数组相邻两个数拼接的大小，后数如果比前数大 则交换
 */
public class GetTheMinNum {
    public static void main(String[] args) {
        int[] arr=new int[]{3,32,321};
        System.out.println(getMinNum(arr));
    }
    public static String getMinNum(int[] input){
        if(input==null || input.length==0){
            return " ";
        }
        for(int i=0;i<input.length;i++){
            for(int j=i+1;j<input.length;j++){
                //使用long，防止int溢出
                if((Long.valueOf(input[i]+""+input[j]))>(Long.valueOf(input[j]+""+input[i]))){
                    int temp=input[j];
                    input[j]=input[i];
                    input[i]=temp;
                }
            }
        }
        String str=new String("");
        for(int i=0;i<input.length;i++){
            str=str+input[i];
        }

        return str;
    }
}
