package com.fxq.base.queue;

import java.util.concurrent.*;

public class BlockingQueueTest {
    public static void main(String[] args) {
        Basket basket = new Basket();
        Producer producer = new Producer(basket);
        Consumer consumer = new Consumer(basket);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(producer);
        executorService.submit(consumer);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }
}
