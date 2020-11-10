package com.uchain.algorithm.stackpractice;

import java.util.Stack;

/**
 * @description 用栈实现队列的入队、出队功能
 */
public class stackforqueue {
    Stack<Integer> stack1=new Stack<Integer>();
    Stack<Integer> stack2=new Stack<Integer>();

    public  void push(int node){
        stack1.push(node);
    }
    public int pop(){
        if(stack2.empty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

}
