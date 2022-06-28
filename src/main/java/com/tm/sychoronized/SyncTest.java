/**
 * @(#)SyncTest.java, 2022/2/14.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.sychoronized;


public class SyncTest {


    public static void main(String[] args) {

        test2();


    }

    public static void test2(){

        MyThread runner1 = new MyThread();
        MyThread runner2 = new MyThread();

        Thread thread1 = new Thread(runner1,"线程1");
        Thread thread2 = new Thread(runner2,"线程2");

        thread1.start();
        thread2.start();
    }



    public static void test1(){

        MyThread runner = new MyThread();

        Thread thread1 = new Thread(runner,"线程1");
        Thread thread2 = new Thread(runner,"线程2");

        thread1.start();
        thread2.start();
    }




}