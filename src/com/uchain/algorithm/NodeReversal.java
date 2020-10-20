package com.uchain.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class NodeReversal {
    public static void main(String[] args) {


    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(listNode!=null){
            list.add(0,listNode.val);
            listNode=listNode.next;
        }
        return list;
    }
}
