/**
 * @(#)MyThread.java, 2022/2/15.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.thread;


public class MyThreadTest    {

    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();

        Thread thread = new Thread(new MyRunner(),"abc");
        thread.start();
    }


}