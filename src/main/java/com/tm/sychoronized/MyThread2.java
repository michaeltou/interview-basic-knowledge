/**
 * @(#)MyThread.java, 2022/2/14.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.sychoronized;

public class MyThread2 implements Runnable {

    private static volatile int count;

    public MyThread2() {
        count = 0;
    }

    @Override
    public void run() {
       // method();
        method2();
    }

    public synchronized  static void method(){
        for (int i = 0; i < 100; i++) {
            System.out.println("当前线程名称:" + Thread.currentThread().getName() + ":" + count++);
        }
    }


    public  static void method2(){
        synchronized(MyThread2.class){


        for (int i = 0; i < 100; i++) {
            System.out.println("当前线程名称:" + Thread.currentThread().getName() + ":" + count++);
        } }
    }
}
