/**
 * @(#)PriorityTest.java, 2022/2/5.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.sort;

import java.util.PriorityQueue;

/**
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @author : douming
 * @version V1.0
 * @Description: TODO
 * @date Date : 2022年02月05日 8:40 下午
 */
public class PriorityTest {



    public static void main(String[] args) {
        PriorityQueue<Person> queue = new PriorityQueue<>();
        Person persion1 = new Person(23);
        Person persion2 = new Person(33);
        Person persion3= new Person(13);
        queue.offer(persion1);
        queue.offer(persion2);
        queue.offer(persion3);
        int size = queue.size();
        for(int i = 0; i< size;i++){
            Person person = queue.poll();
            System.out.println(person);
        }
    }
}