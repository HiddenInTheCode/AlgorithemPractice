package com.uchain.javafoundation;

//equals和==的用法
public class UsingEquals {
    public static void main(String[] args) {
        String s1="zs";
        String s2="zs";
        String s3=new String("zs");
        String s4=new String("zs");
        String s5=s1+s2;
        String s6="zszs";

        System.out.print(s3==s4); //false 因为new的不同对象 地址比较
        System.out.print(s1==s2); //true 因为是常量池中常量的比较

        final String s7="zs";
        final String s8="zs";

        System.out.print(s5==s6);//false 因为s5=s1+s2，这一步进行了new一个新对象的过程


        String s9=s7+s8;
        System.out.print(s9==s6);//true 因为加上final后拼接（s9）该变量为常量
                                 //所以和s6常量相同

        final String s10=s1+s2;

        System.out.print(s10==s5); //false 因为s10=s1+s2，这一步进行了new一个新对象的过程，即使前面加了final也不会改变
    }
}
