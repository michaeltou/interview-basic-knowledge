/**
 * @(#)VarTest.java, 2022/1/28.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved. NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @author : douming
 * @version V1.0
 * @Description: TODO
 * @date Date : 2022年01月28日 3:39 下午
 */
public class VarTest {

    public static void main(String[] args) throws Exception {
        Class childClass = ChildClass.class;

        System.out.println("类的名称是：" + childClass.getName());

        Field[] fieldList = childClass.getFields();

        System.out.println("获取所有public权限的变量");
        for (Field field: fieldList) {
            int modifyer = field.getModifiers();
            System.out
                .println(Modifier.toString(modifyer) + " " + field.getType().getName() + "    " + field.getName());
        }

        System.out.println("获取本类声明的变量");
        Field[] fields = childClass.getDeclaredFields();
        for (Field field: fields) {
            int modifyer = field.getModifiers();
            System.out
                .println(Modifier.toString(modifyer) + " " + field.getType().getName() + "    " + field.getName());
        }

        Field privateField = childClass.getDeclaredField("privateChildValr1");
        if(privateField != null){
            privateField.setAccessible(true);
            ChildClass childClass1 = (ChildClass) childClass.newInstance();
            System.out.println("修改前：" + childClass1.printOneMsg());

            privateField.set(childClass1,"hello,world");
            System.out.println("修改后：" + childClass1.printOneMsg());
        }







    }
}
