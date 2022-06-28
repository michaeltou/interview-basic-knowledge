/**
 * @(#)WaitNotifyTest.java, 2022/2/15.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.thread;



public class WaitNotifyTest {

    public static void main(String[] args) {
        Object lockObject = new Object();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockObject) {
                    try {
                        System.out.println("线程1即将开始在lockObject上等待");
                        lockObject.wait();
                        System.out.println("线程1收到通知并获得锁，开始继续执行");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockObject) {
                    System.out.println("线程2将随机通知在lockObject上等待的线程");
                    lockObject.notify();
                }
            }
        });

        thread1.start();
        thread2.start();
    }



}