package com.uchain.algorithm.linklist;

/**
 * @description 输入两个单调递增的链表，输出两个链表组合之后的链表，该链表满足单调不减的条件
 */
public class OrderTwoList {
    public static ListNode orderTwoList(ListNode list1,ListNode list2){
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        while(list1!=null && list2!=null){
            if(list1.value<list2.value){
                list1.next=orderTwoList(list1.next,list2);
                return list1;
            }else{
                list2.next=orderTwoList(list1,list2.next);
                return list2;
            }
        }
        return list1;
    }
}
