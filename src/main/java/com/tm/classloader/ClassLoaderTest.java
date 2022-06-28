/**
 * @(#)ClassLoaderTest.java, 2022/1/29.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.classloader;

/**
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @author : douming
 * @version V1.0
 * @Description: TODO
 * @date Date : 2022年01月29日 6:42 下午
 */
public class ClassLoaderTest {


    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        System.out.println(loader);

       // loader.loadClass("com.tm.classloader.Test2");

        Class.forName("com.tm.classloader.Test2");
        ClassLoader loader2 = Test2.class.getClassLoader();
        System.out.println(loader2);

    }
}