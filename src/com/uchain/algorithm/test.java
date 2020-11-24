package com.uchain.algorithm;

public class test {
    public static void main(String[] args) {
        float sum=0;
        for(int i=1;i<=4;i++){

            if(i%2==0){
                sum+=-1/i;
                continue;
            }
            sum+=1/i;

        }
        System.out.print(sum);
    }
}
