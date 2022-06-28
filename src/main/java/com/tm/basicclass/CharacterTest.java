/**
 * @(#)CharacterTest.java, 2022/2/13.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.basicclass;


public class CharacterTest {
    public static void main(String[] args) {
        char a = 'a';
        System.out.println(a);

        int[] b = new int[3];

        System.out.println("this is a \"good\" persion");

        Character c = 'b';
        System.out.println(Character.isLetter(c));
        System.out.println(Character.isDigit(c));
    }


}