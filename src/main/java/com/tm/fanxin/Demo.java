/**
 * @(#)Demo.java, 2022/2/13.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.fanxin;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Demo demo = new Demo();

        List<String> strArray = new ArrayList<>();
        strArray.add("test");
        strArray.add("bbbb");
        String str = demo.getFirst(strArray);
        System.out.println(str);

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(34);

        System.out.println(demo.getFirst(nums));

        int[] aa = {3,2,1};

        Integer [] myintArray  ={1,2,3};
        List<Integer> myList = Arrays.asList(myintArray);
        System.out.println(myList);

        Integer [] myintArray1  = new Integer[myList.size()];
        Integer [] myintArray2 =  myList.toArray(myintArray1);
        System.out.println(myintArray1);
        System.out.println(myintArray2);

    }

    private <T> T getFirst(List<T> data){
        if(data == null || data.size() == 0){
            return null;
        }
        return data.get(0);

    }
}