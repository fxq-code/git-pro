package com.fxq.base.queue;

/**
 * 苹果消费者
 */
public class Consumer implements Runnable{
    private Basket basket;

    public Consumer(Basket basket){
        this.basket = basket;
    }

    public void run() {
        try {
            while(true){
                //消费苹果
                System.out.println("消费者准备消费苹果："+System.currentTimeMillis());
                basket.consume();
                System.out.println("消费者消费苹果完毕："+System.currentTimeMillis());
                System.out.println("消费完之后还有苹果"+basket.getAppleNum()+"个");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
