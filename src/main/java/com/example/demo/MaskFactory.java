/**
 * @(#)MaskFactory.java, 2022/1/24.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.example.demo;


public class MaskFactory {

    public IMask createMask(String type){
        IMask mask = null;
         if("高端口罩".equals(type)){
             mask = new HIghEndMask();
         } else if("低端口罩".equals(type)){
             mask= new LowEndMask();
         }
        return mask;
    }



}