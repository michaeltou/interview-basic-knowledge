/**
 * @(#)Consumer.java, 2022/2/15.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.thread;


import java.util.List;

public class Consumer extends Thread{

    private List<Integer> buffer;

    public Consumer(List<Integer> buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while(true){
            synchronized (buffer){

              if(buffer.size()>0){
                  int id = buffer.remove(0);
                  System.out.println("消费产品"+id+"，并通知生产者有空盘子了");
                  buffer.notify();
              } else {
                  System.out.println("盘子是空的，消费者停止消费");
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