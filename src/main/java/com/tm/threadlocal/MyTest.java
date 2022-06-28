/**
 * @(#)MyTest.java, 2022/2/13.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.threadlocal;


public class MyTest {



    public static void main(String[] args) {
        ThreadLocal<String> user = new ThreadLocal<>();
         user.set("name:douming");

        System.out.println(user.get());


        user.remove();
    }
}