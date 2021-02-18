package com.fxq.base.queue;

/**
 * 苹果生产者
 */
public class Producer implements Runnable {
    private Basket basket;

    public Producer(Basket basket){
        this.basket = basket;
    }

    public void run() {
        try {
            while(true){
                System.out.println("生产者准备生产苹果："+System.currentTimeMillis());
                basket.produce();
                System.out.println("生产者生产苹果完毕："+System.currentTimeMillis());
                System.out.println("生产完后有苹果"+basket.getAppleNum()+"个");
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
