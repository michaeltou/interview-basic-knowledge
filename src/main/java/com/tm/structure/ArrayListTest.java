/**
 * @(#)ArrayListTest.java, 2022/2/13.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.structure;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        myList.add("Taobao");
        myList.add("Wiki");
        myList.add("Runoob");
        myList.add("Weibo");
        myList.add("Google");

        Collections.sort(myList);

        for (String item :
                myList) {
            System.out.println(item);
        }



        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

//        myNumbers.addAll();
        myNumbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        Collections.sort(myNumbers);  // 数字排序

        for (int i : myNumbers) {
            System.out.println(i);
        }


    }
}