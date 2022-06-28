/**
 * @(#)ProxyTest.java, 2022/1/26.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.example.demo.aop;

/**
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @author : douming
 * @version V1.0
 * @Description: TODO
 * @date Date : 2022年01月26日 3:46 下午
 */
public class ProxyTest { 

    public static void main(String[] args) {
        Figure figure = new PengYuYan();
        Figure proxyInstance =   (Figure)new AgentProxy(figure).getProxyInstance();

        proxyInstance.skill();
    }
}