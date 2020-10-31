package com.uchain.algorithm.binarytree;

/**
 * @name 二叉搜素树的后序遍历序列
 * @description  输入一个整数，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则返回true，否则返回false。
 * 假设输入的数组的任意两个数字都互不相同。
 */
public class JudgeBinarySearch {
    public static boolean helpVerify(int[] sequence,int start,int root){
        //递归终止条件
        if(start>=root){
            return true;
        }

        int i=0;
        int key=sequence[root];
        for(i=start;i<root;i++){
            if(sequence[i]>key){
                break;
            }
        }
        for(int j=i;j<root;j++){
            if(sequence[j]<key){
                return false;
            }
        }
        return helpVerify(sequence,start,i-1)&&helpVerify(sequence,i,root-1);
    }

    public static boolean VerifySquenceOfBST(int [] sequence){
        if(sequence==null || sequence.length==0)
            return false;
        return helpVerify(sequence,0,sequence.length-1);
    }
}
