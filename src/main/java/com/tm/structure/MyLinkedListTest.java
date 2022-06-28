/**
 * @(#)MyLinkedListTest.java, 2022/2/13.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.structure;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<>();
        sites.add("a");
        sites.add("b");
        sites.add("c");
        sites.addFirst("first");
        sites.addLast("last");
        System.out.println(sites);

     /*   int size = sites.size();
        for(int i=0;i<size;i++){
            System.out.println(sites.get(i));
        }
*/
        for (String entry :
                sites) {
            System.out.println(entry);
        }

        List<String> myList = new ArrayList<>();
        myList.add("1");
        myList.add("2");
        myList.add("3");

        LinkedList<String> testList = new LinkedList<>();
        testList.addAll(myList);
        System.out.println(testList);

        String [] array   = new String[3];
        System.out.println( testList.toArray(array));
        System.out.println(array);
    }





}