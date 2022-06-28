/**
 * @(#)Test.java, 2022/1/24.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.example.demo;

/**
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @author : douming
 * @version V1.0
 * @Description: TODO
 * @date Date : 2022年01月24日 8:53 下午
 */
public class SimpleFactoryTest {

    public static void main(String [] args){

        MaskFactory maskFactory = new MaskFactory();
        IMask highMask = maskFactory.createMask("高端口罩");
        IMask lowMask = maskFactory.createMask("低端口罩");

        highMask.show();
        lowMask.show();
    }
}