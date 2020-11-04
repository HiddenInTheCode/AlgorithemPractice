package com.uchain.algorithm.array;

/**
 * @description 求第n个斐波那契数 n<=39
 * 斐波那契数公式 F(n)=F(n-1)+F(n-2)
 */
public class Fibonacci {
    public int nthFibonacciNum(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return nthFibonacciNum(n-1)+nthFibonacciNum(n-2);
    }
}
