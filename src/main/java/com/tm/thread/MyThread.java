/**
 * @(#)MyThread.java, 2022/2/15.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.thread;


public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("mythread 执行了");
    }
}