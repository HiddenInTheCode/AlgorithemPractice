package com.uchain.algorithm.binarytree;

/**
 * @description  二叉树遍历算法           树节点
 */
public class ReversalTreeNode {

    int val;

    ReversalTreeNode left;

    ReversalTreeNode right;

    ReversalTreeNode(){

    }

    ReversalTreeNode(int val){
        this.val=val;
    }

    ReversalTreeNode(ReversalTreeNode left,ReversalTreeNode right,int val){
        this.left=left;
        this.right=right;
        this.val=val;
    }



}
