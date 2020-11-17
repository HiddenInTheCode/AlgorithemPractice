package com.uchain.algorithm.math;

/**
 * @description 求一个int型整数的double次方的结果,保证base和exponent不同时为0
 * 注意：考虑这两个参数的符号问题（正或负）
 */
public class Power {
    public static double power(double base,int exponent){
        double res=1.0;
        if(base==0){
            return 0;
        }
        if(exponent>0){
            for(int i=0;i<exponent;i++){
                res*=base;
            }
            return res;
        }else if(exponent==0){
            return 1;
        }
        else{
            for(int i=0;i<exponent;i++){
                res*=base;
            }
            return 1/base;
        }
    }
}
