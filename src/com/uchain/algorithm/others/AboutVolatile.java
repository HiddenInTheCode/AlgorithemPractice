package com.uchain.algorithm.others;

import java.util.concurrent.TimeUnit;

/**
 * java中的volatile保证内存可见性
 * volatile能保证数组和对象的内部元素元素的可见性？
 */
public class AboutVolatile {
    public static volatile int[] ints=new int[5];
    public static void main(String[] args) throws Exception {
        Object o = new Object();
        new Thread(() -> {
            //线程A
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ints[0] = 2;
        }).start();
        new Thread(() -> {            //线程B
            while (true) {
                if (ints[0] == 2) {
                    System.out.println("结束");
                    break;
                }
            }
        }).start();
    }
}
