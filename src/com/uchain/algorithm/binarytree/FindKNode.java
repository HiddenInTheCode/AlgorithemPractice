package com.uchain.algorithm.binarytree;

import java.util.Stack;

/**
 * @description  模块：树
 * 给定一个二叉搜索数，请找出第k小的节点
 */
public class FindKNode {
    public static void main(String[] args) {

    }

    public static KNode findknumber(KNode root,int k){
        if(root==null || k<=0){
            return null;
        }
        //建立栈
        Stack<KNode> stack=new Stack<>();
        KNode cur=root;

        //while部分为中序遍历
        while(!stack.isEmpty() || cur!=null){
            if(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }else{
                cur=stack.pop();//当当前节点为null的时候出栈
                if(--k==0){
                    return cur;
                }
                cur=cur.right;
            }
        }
        return null;
    }
}
