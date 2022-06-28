/**
 * @(#)Point.java, 2022/2/13.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.fanxin;


public class Point<T> {




    private T x;
    private T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public static void main(String[] args) {

        Point<Integer> p = new Point<>();
        p.setX(new Integer(100));
        System.out.println(p.getX());



        Point<Float> p2 = new Point<>();
        p2.setX(new Float(1.23f));
        System.out.println(p2.getX());



    }








}