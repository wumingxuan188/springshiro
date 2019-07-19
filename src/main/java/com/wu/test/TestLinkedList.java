package com.wu.test;

import java.util.*;

public class TestLinkedList {
    public static void main(String[] args) {
       List<String> list = new LinkedList<>();
       list.add("a");
       list.add("b");
       list.add("c");
       list.add("d");
        ListIterator<String> iterator = list.listIterator();
        iterator.next();
        //在某位置增加某值
        boolean z = list.contains("z");
        System.out.println(z);
        iterator.add("z");
        //修改值
        //iterator.set("z");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
           String s = it.next();
           System.err.println(s);
       }
    }
}
