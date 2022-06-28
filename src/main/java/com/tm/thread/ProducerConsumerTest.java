/**
 * @(#)ProducerConsumerTest.java, 2022/2/15.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.thread;


import java.util.LinkedList;
import java.util.List;

public class ProducerConsumerTest {

    public static void main(String[] args) {
        List<Integer> buffer = new LinkedList<Integer>();

        int maxSize = 10;

        Producer producer = new Producer(buffer,maxSize);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }


}