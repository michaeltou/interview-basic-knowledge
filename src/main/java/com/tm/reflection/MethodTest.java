/**
 * @(#)VarTest.java, 2022/1/28.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved. NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @author : douming
 * @version V1.0
 * @Description: TODO
 * @date Date : 2022年01月28日 3:39 下午
 */
public class MethodTest {

    public static void main(String[] args) throws Exception {
        Class childClass = ChildClass.class;

        System.out.println("类的名称是：" + childClass.getName());

       // Method[] methodList = childClass.getMethods();
        Method[] methodList = childClass.getDeclaredMethods();


        System.out.println("获取所有public权限的变量");
        for (Method method: methodList) {
            int modifyer = method.getModifiers();
            System.out.print(Modifier.toString(modifyer) + " " + method.getReturnType().getName() + "    " + method.getName());


            System.out.print ("(");
            Parameter[]  parameters = method.getParameters();
            for (Parameter parameter:parameters ) {
                System.out.print(parameter.getType().getName() + "  " + parameter.getName() + ", ");
            }

            System.out.println(")");

        }
    }
}
