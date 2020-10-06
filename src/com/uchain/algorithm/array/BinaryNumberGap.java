package com.uchain.algorithm.array;

/**
 * 整数转换为二进制后，求出相邻的两个1的最长距离
 * ①使用位运算找出出现1的索引值，然后遍历比较两个索引之间的差，最大的输出
 */
public class BinaryNumberGap {
    public static void main(String[] args) {
        System.out.println(getDis(2));
    }

    public static int getDis(int num){
        int[] binary=new int[32];
        int t=0;
        int ret=0;
        for(int i=0;i<32;++i){
            //从num的第0位开始，是否是1为判断条件
            if(((num>>i)&1)!=0){
                //将该数二进制中含1的索引存到数组中
                binary[t++]=i;
            }
        }

        //判断索引之间的差 比较后取出差的最大值
        for(int j=0;j<binary.length-1;j++){
            ret=Math.max(ret,binary[j+1]-binary[j]);
        }
        return ret;
    }

}
