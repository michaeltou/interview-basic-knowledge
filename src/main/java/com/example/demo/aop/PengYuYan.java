/**
 * @(#)PengYuYan.java, 2022/1/26.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.example.demo.aop;

import org.springframework.stereotype.Component;

/**
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @author : douming
 * @version V1.0
 * @Description: TODO
 * @date Date : 2022年01月26日 3:42 下午
 */
@Component("PengYuYan")
public class PengYuYan implements Figure {
    @Override
    public void skill() {
        System.out.println("I'm michael, I can play.");
    }
}