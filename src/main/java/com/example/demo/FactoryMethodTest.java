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
public class FactoryMethodTest {

    public static void main(String [] args){

       IFactory highEndFactory = new HighEndFactory();
        IFactory lowEndFactory = new LowEndFactory();

        IMask highMask = highEndFactory.createMask();
        IMask lowMask = lowEndFactory.createMask();

        highMask.show();
        lowMask.show();
    }
}