package com.uchain.algorithm.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @description 按照“之”字形遍历二叉树，即第一行从左到右，第二行从右到左依次交替
 * 思路：
 * 主要的方法与BFS写法没什么区别
 * BFS里是每次只取一个，而我们这里先得到队列长度size，这个size就是这一层的节点个数，然后通过for循环去poll出这size个节点。
 * 这里和按行取值二叉树返回ArrayList<ArrayList<Integer>>这种题型的解法一样，之字形取值的核心思路就是通过两个方法：
 * list.add(T): 按照索引顺序从小到大依次添加
 * list.add(index, T): 将元素插入index位置，index索引后的元素依次后移,这就完成了每一行元素的倒序，或者使用Collection.reverse()方法倒序也可以
 */
public class PrintBinaryTreeByOrder {
    public ArrayList<ArrayList<Integer>> Print(PrintNode root){
        LinkedList<PrintNode > q=new LinkedList<>();
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        boolean rev=true;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                PrintNode node=q.poll();
                if(node==null)
                    continue;

                if(rev){
                    list.add(node.val);
                }
                else{
                    list.add(0,node.val);
                }
                q.offer(node.left);
                q.offer(node.right);
            }
            if(list.size()!=0){
                res.add(list);
                rev=!rev;
            }
        }
        return  res;
    }
}
