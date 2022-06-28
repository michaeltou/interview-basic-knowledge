/**
 * @(#)MyThread.java, 2022/2/14.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.sychoronized;

public class MyThread implements Runnable {

    private static volatile int count;

    public MyThread() {
        count = 0;
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("当前线程名称:" + Thread.currentThread().getName() + ":" + count++);
            }
        }
    }

    public static void method(){
        for (int i = 0; i < 100; i++) {
            System.out.println("当前线程名称:" + Thread.currentThread().getName() + ":" + count++);
        }
    }
}
