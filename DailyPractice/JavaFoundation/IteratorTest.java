package com.uchain.javafoundation;

import java.util.*;

/**
 * 使用迭代器遍历list
 */
public class IteratorTest {
    public static void main(String[] args) {
        List<String> arraylist=new ArrayList<String>();
        arraylist.add("A1");
        arraylist.add("高闪");
        arraylist.add("来一个好吗");

        List<String> linkedlist=new ArrayList<String>();
        linkedlist.add("秋梨膏");

        Set<String> hashSet=new HashSet<String>();
        hashSet.add("!");

        Iterator<String> listit=arraylist.iterator();
        while(listit.hasNext()){
            System.out.println(listit.next());
        }

        Iterator<String> linkit=linkedlist.iterator();
        while(linkit.hasNext()){
            System.out.println(linkit.next());
        }

        Iterator<String > setit=hashSet.iterator();
        while(setit.hasNext()){
            System.out.println(setit.next());
        }

    }
}
