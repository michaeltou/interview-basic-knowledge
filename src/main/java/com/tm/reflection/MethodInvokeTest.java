/**
 * @(#)MethodInvokeTest.java, 2022/1/28.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.reflection;

import java.lang.reflect.Method;

/**
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @author : douming
 * @version V1.0
 * @Description: TODO
 * @date Date : 2022年01月28日 4:57 下午
 */
public class MethodInvokeTest {

    public static void main(String[] args) throws Exception{


        Class childClass = ChildClass.class;

        System.out.println("类的名称是：" + childClass.getName());


       Method privateMethod =  childClass.getDeclaredMethod("privatePrintBaseMsg", String.class);

       privateMethod.setAccessible(true);

       ChildClass childClass1 =  (ChildClass)childClass.newInstance();

       privateMethod.invoke(childClass1,"hello,world");


    }
}