/**
 * @(#)SwitchTest.java, 2022/2/13.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.basicclass;


public class SwitchTest {

    public static void main(String[] args) {
        char grade = 'C';
        String str ="hello";

        switch (grade){
            case 'A':
                System.out.println("优秀");break;
            case 'B':
                System.out.println("良好");break;
            case 'C':
                System.out.println("一般");break;
            case 'D':
                System.out.println("及格");break;
            default:
                System.out.println("再接再厉");
        }

        System.out.println("你的等级是："+grade);
    }
}