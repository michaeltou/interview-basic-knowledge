/**
 * @(#)BubbleSortTest.java, 2022/2/5.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.sort;

import java.util.Arrays;

/**
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @author : douming
 * @version V1.0
 * @Description: TODO
 * @date Date : 2022年02月05日 2:46 下午
 */
public class InsertSortTest {

    public static int[] InsertSort(int[] data){
        int size = data.length;
        for(int i=1;i<= size-1;i++){
             for(int j=i;j>0;j--){
                if(data[j]<data[j-1]){
                    switchData(data,j,j-1);
                    break;
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
        int[] newArray = InsertSort(data);
        System.out.println(Arrays.toString(newArray));
    }
}