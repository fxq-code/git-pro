package com.fxq.base.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        //创建queue
        Queue<String> queue = new LinkedList<String>();
        //add 添加
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        for (String s : queue) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("----------------");

        //remove 删除
        String element = queue.remove();
        System.out.println("从队头删除元素："+element);
        for (String s : queue) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("----------------");

        //element 获取第一个元素
        String element1 = queue.element();
        System.out.println("获取第一个元素："+element1);
        for (String s : queue) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("----------------");

        //offer 添加
        queue.offer("e");
        queue.offer("f");
        for (String s : queue) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("----------------");

        //poll 删除队头元素
        String poll = queue.poll();
        System.out.println("从队头删除元素："+poll);
        for (String s : queue) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("----------------");

        //peek 获取队头
        String peek = queue.peek();
        System.out.println("获取队头元素："+peek);
        for (String s : queue) {
            System.out.print(s+" ");
        }
    }
}
