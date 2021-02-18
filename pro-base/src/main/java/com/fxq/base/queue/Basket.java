package com.fxq.base.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 装苹果的篮子
 */
public class Basket {
    //能装6个苹果
    BlockingQueue<String> basket = new ArrayBlockingQueue<String>(6);

    //装入苹果
    public void produce() throws InterruptedException {
        basket.put("apple");
    }

    //取出苹果
    public String consume() throws InterruptedException {
        return basket.take();
    }

    //统计个数
    public int getAppleNum(){
        return basket.size();
    }
}

