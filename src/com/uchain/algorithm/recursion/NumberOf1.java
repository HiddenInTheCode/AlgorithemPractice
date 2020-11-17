package com.uchain.algorithm.recursion;

/**
 * 递归
 *
 *
 * @description 输入一个整数，输出该数32位二进制表示中1的个数。
 * 其中负数用补码表示
 */
public class NumberOf1 {
    //①将输入数字转为字符串，然后判断字符串中是否包含字符'1'，然后返回出现'1'的次数
    public static int numberof1(int num){
        int count=0;
        String s=Integer.toBinaryString(num);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count;

    }

    //②使用一个flag和输入数字进行&运算，如果&运算结不为0，则计数+1。
    // 然后将flag左移，继续该操作。
    public static int numberof2(int n){
        int flag=1,count=0;
        while(flag!=0){
            if((flag&n)!=0){
                count++;
            }
            flag<<=1; //flag向左移动一位
        }
        return count;
    }

}
