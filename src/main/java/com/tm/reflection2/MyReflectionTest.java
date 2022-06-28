/**
 * @(#)MyReflectionTest.java, 2022/1/28.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.reflection2;

/**
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @author : douming
 * @version V1.0
 * @Description: TODO
 * @date Date : 2022年01月28日 6:35 下午
 */
public class MyReflectionTest {

    public static void main(String[] args) throws ClassNotFoundException {
        Student student = new Student();

        Class stuClass = student.getClass();

        System.out.println(stuClass.getName());

//        System.out.println( stuClass.isInstance(student));

        System.out.println(student instanceof Student );


//        Class stuClass2  =Student.class;
//        System.out.println(stuClass == stuClass2);
//
//
//
//        Class stuClass3 = Class.forName("com.tm.reflection2.Student");
//
//        System.out.println(stuClass == stuClass3);
    }


}