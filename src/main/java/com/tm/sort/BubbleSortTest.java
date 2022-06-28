/**
 * @(#)BubbleSortTest.java, 2022/2/5.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.sort;

import java.util.Arrays;

public class BubbleSortTest {

    public static int[] bubbleSort(int[] data){
        int size = data.length;
        for(int i=0;i<= size-1-1;i++){
            for(int j=0;j<= size-1-i-1;j++){
                if(data[j]>data[j+1]){
                    switchData(data,j,j+1);
                }
            }
        }

        return data;
    }

    public static void switchData(int[] data,int a, int b ){
        int temp = data[a];
        data[a]= data[b];
        data[b] = temp;
    }

    public static void main(String[] args){
        int[] data = {2,5,3,9,7};

        System.out.println(Arrays.toString(data));
        int[] newArray = bubbleSort(data);
        System.out.println(Arrays.toString(newArray));
    }
}