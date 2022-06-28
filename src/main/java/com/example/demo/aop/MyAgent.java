/**
 * @(#)MyAgent.java, 2022/1/26.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.example.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class MyAgent {

    @Before("execution(void com.example.demo.aop.Figure.skill())")
    public void doSkill(){
        System.out.println("我是经纪人");
    }
}