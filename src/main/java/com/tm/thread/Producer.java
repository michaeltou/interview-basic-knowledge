/**
 * @(#)Producer.java, 2022/2/15.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.thread;


import java.util.List;

public class Producer extends Thread {

    private List<Integer> buffer;
    private  int maxSize;

    public Producer(List<Integer> buffer, int maxSize){
        this.buffer = buffer;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        int id =0;
        while(true){

            synchronized (buffer){
                if(buffer.size() < maxSize){
                    id++;
                    buffer.add(id);
                    System.out.println("生产产品"+id+ "并通知消费者可以消费了");
                    buffer.notify();
                } else {
                    System.out.println("没有空盘子了，生产者停止生产产品");
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }

    }
}