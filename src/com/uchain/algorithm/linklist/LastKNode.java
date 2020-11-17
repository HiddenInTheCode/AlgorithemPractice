package com.uchain.algorithm.linklist;

/**
 * 双指针
 *
 * @description 输入一个链表，输出该链表中倒数第k个节点。
 * 思路：使用双指针，这两个指针的位置相差k-1的距离，
 * 当快指针走到最后一个节点的时候，慢指针指向的位置就是我们要的倒数第k个节点了
 *
 */
public class LastKNode {
    public ListNode FindKthToTail(ListNode head,int k){
        if(k <= 0)
            return null;
        ListNode low = head;
        ListNode fast = head;
        for(int i=1; i < k;i++){
            if(fast == null)
                return null;
            else
                fast = fast.next;
        }
        if(fast == null)
            return null;
        while(fast.next != null){
            low = low.next;
            fast = fast.next;
        }
        return low;
    }
}
