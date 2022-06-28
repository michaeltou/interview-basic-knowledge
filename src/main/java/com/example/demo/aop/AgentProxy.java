/**
 * @(#)AgentProxy.java, 2022/1/26.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.example.demo.aop;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AgentProxy {

    private Object object;

    public AgentProxy(Object object) {
        this.object = object;
    }

    public Object getProxyInstance(){
       return  Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("i'm agent");
                Object returnValue = method.invoke(object,args);
                return returnValue;
            }
        });
    }

}