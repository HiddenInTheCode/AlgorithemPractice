package com.uchain.algorithm.linklist;

import java.util.ArrayList;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class NodeReversal {
    public static void main(String[] args) {


    }

    public static ArrayList<Integer> printListFromTailToHead(ReversalNode reversalNode){
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(reversalNode !=null){
            list.add(0, reversalNode.val);
            reversalNode = reversalNode.next;
        }
        return list;
    }
}
