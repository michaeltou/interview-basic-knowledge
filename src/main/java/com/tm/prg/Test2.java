/**
 * @(#)Test2.java, 2022/2/6.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.prg;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int size = arr.length;
        List<Integer> result = new ArrayList<>();
        if (x <= arr[0]) {
            for (int i = 0; i < k; i++) {
                result.add(arr[i]);
            }

            return result;
        }

        if (x >= arr[size-1]) {
            for (int i = size - k; i < size; i++) {
                result.add(arr[i]);
            }
            return result;
        }

        int left = 0;
        int right = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > x) {
                left = i - 1;
                right = i;
                break;
            }
        }

        int ldistance = 0;
        int rdistance = 0;
        int count = 0;
        while (count < k) {

            if (left >= 0) {
                ldistance = Math.abs(arr[left] - x);
                System.out.println("左边距离是:" + ldistance);
            }

            if (right <= size - 1) {
                rdistance = Math.abs(arr[right] - x);
                System.out.println("右边距离是:" + rdistance);
            }

            if ((ldistance <= rdistance && left >= 0) || right > size - 1) {
                count++;
                result.add(arr[left]);
                System.out.println("队列新增：" + arr[left]);
                left--;
                continue;
            }

            if ((ldistance > rdistance && right <= size - 1) || left < 0) {
                count++;
                result.add(arr[right]);
                System.out.println("队列新增：" + arr[right]);
                right++;
                continue;
            }

        }

        result.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        return result;
    }
}
