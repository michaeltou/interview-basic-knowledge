/**
 * @(#)Test1.java, 2022/2/24.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.test;

public class Test1 {

    public boolean judge (String str) {

        if(str.length() == 0 || str.length() == 1){
            return true;
        }

        int left = 0;
        int right = str.length()-1;
        while(left < right){
//            if( str.charAt(left++) != str.charAt[right--] ){
//                return false;
//            }
        }
        return true;


    }
}