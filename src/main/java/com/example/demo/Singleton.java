/**
 * @(#)Singleton.java, 2022/1/24.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.example.demo;

/**
 */
public class Singleton {

    private Singleton(){}

    private static volatile Singleton instance = null;

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null) {
                    instance = new Singleton();
                }
            }

        }

        return instance;
    }
}