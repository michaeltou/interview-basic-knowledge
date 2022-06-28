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
public class SelectionSortTest {

    public static int[] selectSort(int[] data){
        int size = data.length;
        for(int i=0;i<= size-1-1;i++){
            int minIndex = i;
             for(int j=i+1;j<=size-1;j++){
                 minIndex = data[minIndex]>data[j]?j:minIndex;
             }
             switchData(data,i,minIndex);
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
        int[] newArray = selectSort(data);
        System.out.println(Arrays.toString(newArray));
    }
}