/**
 * @(#)Test.java, 2022/2/12.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.example.demo.aop;

//  2个有序的集合，合并成一个有序的集合。
//时间复杂度是o(n)
import java.util.*;


public class SortUtil<T extends Comparable> {

    public List<T> sort(List<T> one, List<T> other) {

        List<T> resultList = new ArrayList<>();

        int oneSize = one.size();
        int otherSize = other.size();
        int totalSize = oneSize + otherSize;

        //放入队列
        Deque<T> oneQueue = new LinkedList<>();
        for (int i = 0; i < totalSize; i++) {
            oneQueue.add(one.get(i));
        }
        //放入队列
        Deque<T> otherQueue = new LinkedList<>();
        for (int i = 0; i < totalSize; i++) {
            otherQueue.add(other.get(i));
        }

        //再加一些极端场景的优化
        for (int i = 0; i < totalSize; i++) {
            T oneData = oneQueue.peek();
            T otherData = otherQueue.peek();
            if (oneData.compareTo(otherData) == -1) {
                resultList.add(oneQueue.remove());
            } else {
                resultList.add(otherQueue.remove());
            }
        }

        return resultList;
    }



}
