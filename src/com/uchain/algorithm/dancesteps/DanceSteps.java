package com.uchain.algorithm.dancesteps;

/**
 * @description 跳台阶
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）
 *
 * 思路：①递归思路，跳上n阶台阶，可以理解成跳上n-1个台阶和跳上n-2个台阶的方法数之和。
 * 即f(n)=f(n-1)+f(n-2)
 * 复杂度:O(2^n)
 *
 * ②自上向下（面试推荐）
 * 自底向上循环求解
 * 复杂度：O(n)
 */
public class DanceSteps {
    //②
    public int JumpFloor(int target){
        int a=1,b=1;
        for(int i=1;i<target;i++){
            a=a+b;
            b=a-b;
        }
        return a;
    }
}
