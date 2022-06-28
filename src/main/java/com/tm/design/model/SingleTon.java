/**
 * @(#)SingleTon.java, 2022/2/11.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.design.model;


public class SingleTon {

    public static volatile SingleTon singleTon;


    public static SingleTon getInstance(){
        if(singleTon == null){
            synchronized (SingleTon.class){
                if(singleTon == null) {
                    singleTon = new SingleTon();
                }
            }

        }

        return singleTon;
    }
}