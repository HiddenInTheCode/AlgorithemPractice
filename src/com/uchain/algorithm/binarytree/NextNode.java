package com.uchain.algorithm.binarytree;

/**
 * @description 查找二叉树的下一个节点
 * 思路：先找到根节点，然后对树进行中序遍历，最后根据中序遍历结果找到给定节点的下一节点
 */
public class NextNode {
    int val=0;

    NextNode left=null;

    NextNode right=null;

    NextNode parent=null;

    public NextNode(int val){
        this.val=val;
    }
}
