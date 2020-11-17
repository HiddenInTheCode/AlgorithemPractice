package com.uchain.algorithm.linklist;

/**
 * @description  反转链表
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class ReverseList {
    public ListNode reverseList(ListNode head){
        if(head==null){
            return null;
        }
        ListNode pre=null;
        ListNode next=null;
        while(head!=null){
            //反转过程
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
}
