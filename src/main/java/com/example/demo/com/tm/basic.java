/**
 * @(#)basic.java, 2022/2/14.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.example.demo.com.tm;


import java.util.Arrays;

public class basic {

    public static void main(String[] args) {

        int a = 60;
        int b = 13;
        System.out.println(a&b);
        int value = Integer.valueOf('A');
        System.out.println("十进制："+value+"，二进制："+Integer.toBinaryString(value)+"，ox："+Integer.toHexString(value));


        System.out.println(a|b);
        System.out.println(~a);

        System.out.println(a<<2);
        System.out.println(a>>2);
        System.out.println(a>>>2);

        String name ="douming";
        boolean result = name instanceof String;
        System.out.println(result);

        int[] myintArray = {0,1,2,3,4,5,33,6,7,8,9};

       int index = Arrays.binarySearch(myintArray,20);
        System.out.println("二分查找结果索引:"+index);
        Arrays.sort(myintArray);
        System.out.println(myintArray);
        for (int item :
                myintArray) {
            System.out.print(" "+item);
        }


    }




}