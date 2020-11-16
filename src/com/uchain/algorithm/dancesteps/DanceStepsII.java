package com.uchain.algorithm.dancesteps;

/**
 * @description 变态跳台阶
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * 根据数学公式：f(n)=f(n-1)+f(n-2)+...+f(1)
 * f(n-1)=f(n-2)+f(n-3)+...+f(1)
 * 两式相减得f(n)=2*f(n-1)
 * 所以使用递归就可得出答案
 */
public class DanceStepsII {
    public static int danceStep(int target){
        if(target<=1){
            return 1;
        }
        return 2*danceStep(target-1);
    }
}
