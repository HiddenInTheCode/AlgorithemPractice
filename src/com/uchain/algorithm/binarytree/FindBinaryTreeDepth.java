package com.uchain.algorithm.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description 求二叉树的深度，递归和非递归方式
 */
public class FindBinaryTreeDepth {
    //递归方式
    public int TreeDepth(DepthNode root){
        if(root==null){
            return 0;
        }
        int leftlen=TreeDepth(root.left);
        int rightlen=TreeDepth(root.right);
        return Math.max(leftlen,rightlen);
    }

    /**
     * 非递归方式
     * 思路：
     *
     */
    public int TreeDepth2(DepthNode root){
        if(root==null){
            return 0;
        }
        Queue<DepthNode> q=new LinkedList<DepthNode>();
        q.add(root);
        //q.size() 返回队列元素个数
        int d=0,count=0,nextcount=q.size();
        while(q.size()!=0){
            //移除队列头部
            DepthNode node=q.poll();
            count++;
            if(node.left!=null){
                q.add(node.left);
            }
            if(node.right!=null){
                q.add(node.right);
            }
            if(count==nextcount){
                d++;
                count=0;
                nextcount=q.size();
            }
        }
        return d;
    }
}
