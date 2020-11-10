package com.uchain.algorithm.stackpractice;

import java.util.Stack;

/**
 * @description 判断一个序列是否是另一个栈序列的弹出序列
 * 思路：判断弹出栈数组元素和入栈的栈顶元素是否相同，相同，则弹出栈数组的下标+1，如果弹出栈数组元素值和入栈的元素值个数相同，则能成功的遍历完整个栈
 */
public class judgeIsStackOrder {
    public boolean isPopOrder(int[] pushA,int[] popA){
        Stack<Integer> stack=new Stack<Integer>();
        int count=0;
        for(int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            while(!stack.empty() && stack.peek() == popA[count]){ //栈顶元素和出栈数组元素是否相同，如果相同则判断下一个，同时，栈元素弹出
                stack.pop();
                count++;
            }
        }
        return count==popA.length;
    }
}
