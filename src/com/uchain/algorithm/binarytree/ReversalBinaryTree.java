package com.uchain.algorithm.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * @description  前序遍历二叉树 尽量使用迭代而非递归
 * 递归方式遍历二叉树节点思路：按照遍历的顺序（前序 中序  后序），将对应的节点存入到一个list里面，该list的顺序输出结果就是
 * 二叉树遍历的结果
 */
public class ReversalBinaryTree {
    public static void main(String[] args) {


    }
//方法1：使用递归方式
    public static void reversalBinaryTree(ReversalTreeNode treeNode,List<Integer> resultlist){
        if(treeNode ==null){
            return ;
        }
        resultlist.add(treeNode.val);
        reversalBinaryTree(treeNode.left,resultlist);
        reversalBinaryTree(treeNode.right,resultlist);
    }

    public static List<Integer> reversal(ReversalTreeNode treeNode){
        List<Integer> res=new ArrayList<Integer>();
        reversalBinaryTree(treeNode,res);
        return  res;
    }

//方法2：使用迭代方式
    
}
