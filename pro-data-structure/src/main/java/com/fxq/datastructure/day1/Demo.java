package com.fxq.datastructure.day1;

public class Demo {
    public static void main(String[] args) {
        System.out.println("printN 执行开始时间："+System.currentTimeMillis());
        printN(100);
        System.out.println("printN 执行结束时间："+System.currentTimeMillis());
        System.out.println("printM 执行开始时间："+System.currentTimeMillis());
        printM(100);
        System.out.println("printM 执行结束时间"+System.currentTimeMillis());
    }

    private static void printN( int n){
        int i;
        for (i =1 ;i <= n; i++){
            System.out.println(i);
        }
    }

    private static void printM(int m){
        if(m >= 0){
            printM(m -1);
            System.out.println(m);
        }
    }
}
