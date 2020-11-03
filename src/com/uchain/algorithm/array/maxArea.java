package com.uchain.algorithm.array;

/**
 * 容器盛水最多，输入的是一个数组
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 *
 *
 *
 * 解法1：双指针解法
 */
public class maxArea {
    public static void main(String[] args) {
        System.out.println(maxWater(new int[]{1,5,6,7,8,6,9}));
    }

    public static int maxWater(int[] input){
        int l=0,r=input.length-1;
        int answer=0;
        while(l<r){
            int area=Math.min(input[l],input[r])*(r-l);
            answer=Math.max(answer,area);
            if(input[l]<input[r]){
                ++l;
            }else{
                --r;
            }
        }
        return answer;
    }
}
