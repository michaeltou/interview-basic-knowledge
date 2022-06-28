/**
 * @(#)ThreadTest.java, 2022/2/3.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.classloader;


import java.util.HashMap;

/**
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @author : douming
 * @version V1.0
 * @Description: TODO
 * @date Date : 2022年02月03日 12:34 下午
 */
public class ThreadTest {

    public static void main(String[] args) {
        ThreadLocal<String> myStrResource = new ThreadLocal<>();

        myStrResource.set("abc");

        myStrResource.get();
        myStrResource.remove();

        HashMap myMap = new HashMap();


        myMap.put("a","b");




    }

}