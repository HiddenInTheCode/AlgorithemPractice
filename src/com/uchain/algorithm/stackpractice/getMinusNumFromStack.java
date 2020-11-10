package com.uchain.algorithm.stackpractice;

import java.util.Stack;

/**
 * @description 实现获取栈中最小的元素
 * 思路：创建两个栈，一个栈获取所有元素，另一个栈将最小的元素放置栈顶，该栈的栈顶元素就是最小的元素。注：两个栈的元素数量要相同
 */
public class getMinusNumFromStack {
    Stack<Integer> stackTotal=new Stack<Integer>();
    Stack<Integer> stackLittle=new Stack<Integer>();

    public void push(int node){
        stackTotal.push(node);
        if(stackLittle.empty()){
            stackLittle.push(node);
        }
        else {
            if(node<=stackLittle.pop()){
                stackLittle.push(node);
            }
            else {
                //保持两个栈的元素数量一致
                stackLittle.push(stackLittle.peek());
            }
        }
    }
    public void pop(){
        stackLittle.pop();
        stackTotal.pop();
    }

    public int top(){
        return stackTotal.peek();
    }
    /**
     * 获取最小元素
     * @return
     */
    public int min(){
        return stackLittle.peek();
    }
}
