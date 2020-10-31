package com.uchain.algorithm.binarytree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @description 打印二叉树节点（从上到下，同层从左到右）
 * 思路：创建一个队列来完成广度遍历二叉树节点的效果
 * ①首先将根节点放置队首，然后将根节点的值存入list中，然后移除队首（让后面的子节点变成队首）
 * ②判断队首（根节点或者是后面的左子节点、右子节点）是否有左节点，如果有左节点，将左节点加入到队尾，如果有右节点，将右节点加入到队尾，这一步可以实现从左到右的遍历节点
 * ③当while里的“队列不为空”为真时，当所有节点依次变为队首，它们的值就可以被添加到list里面了，然后返回list便可以得到结果。
 */
public class PrintBinaryTree {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> printtree(PrintNode root){
        Deque<PrintNode> deque=new LinkedList<>();
        ArrayList<Integer> res=new ArrayList<>();

        if(root==null){
            return res;
        }
        //根节点加入到队列当中
        deque.add(root);

        while(!deque.isEmpty()){
            PrintNode node=deque.getFirst();
            //pollFirst()  将队列的第一个元素移除
            deque.pollFirst();
            res.add(node.val);

            if(node.left !=null){
                deque.addLast(node.left);
            }
            if(node.right!=null){
                deque.addLast(node.right);
            }
        }

        return  res;
    }
}
