package com.uchain.algorithm.strings;

/**
 * 判断一个整数是不是回文数 并且不将该数转换为字符串
 */
public class isPalindrome {
    public static void main(String[] args) {
        System.out.println(ishuiwen(12321));

    }

    public static boolean ishuiwen(int input){
        //如果输入的数字最后一位为0或者为负数，则不可能有回文数
        if(input<0 || (input%10==0 && input!=0) )
            return false;

        //正数则取余数与输入数字（奇数、偶数）前一半对比
        //当输入数为奇数的时候，以中央一位数为中心比较 偶数的话以中心为对称线 比较的条件就是“前一半的数字是否是大于后一半的数字"
        int revertnum=0;
        while(input>revertnum){
            revertnum=input%10+revertnum*10;
            input/=10;
        }

        return input==revertnum || input==revertnum/10;
    }
}
