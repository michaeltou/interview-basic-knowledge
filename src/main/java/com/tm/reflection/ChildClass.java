/**
 * @(#)ChildClass.java, 2022/1/28.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.reflection;

/**
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @author : douming
 * @version V1.0
 * @Description: TODO
 * @date Date : 2022年01月28日 3:38 下午
 */
public class ChildClass extends BaseClass{

    public String baseChildValr1;
    public String baseChildValr2;

    private String privateChildValr1;
    private String privateChildValr2;

    public String printOneMsg(){
        return privateChildValr1;
    }


    private void privatePrintBaseMsg(String var){
        System.out.println("子类-私有方法, var="+var);
    }

    public void publicPrintBaseMsg(String var){
        System.out.println("子类-公有方法, var="+var);
    }
}