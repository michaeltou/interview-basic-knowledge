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
public class QuickSortTest {

    public static int[] mySort(int[] data, int start, int end){
        if(start >= end){
            return data;
        }
        int centerIndex = quickSort(data,start,end);
        //System.out.println("the centerIndex ="+ centerIndex);
        mySort(data,start,centerIndex-1);
        mySort(data,centerIndex+1,end);
        return data;
    }

    public static int quickSort(int[] data, int leftIndex, int rightIndex){

        System.out.println("最新数据是:"+Arrays.toString(data));


        System.out.print("本次排序数据:");
        for(int i=leftIndex;i<=rightIndex;i++){
            System.out.print( " "+data[i]);
        }
        System.out.print("\n");


        if(leftIndex == rightIndex){
            return leftIndex;
        }
        int pivoitIndex = leftIndex;
        leftIndex = leftIndex+1;

        int stopI = leftIndex;
        int stopJ = rightIndex;

        int count=0;
        while (stopI<stopJ) {

            for (int j = stopJ; j >= stopI; j--) {
                stopJ=j;
                if (data[j] < data[pivoitIndex]  ) {
                    break;
                }
                if(stopI  == stopJ){
                    break;
                }

            }

            // System.out.println("repeating:count="+ count++);
            for (int i = stopI; i <= stopJ; i++) {
                stopI=i;
                if (data[i] > data[pivoitIndex]  ) {
                    break;
                }

                if(stopI  == stopJ){
                    break;
                }

            }

            if(data[stopI] > data[stopJ]){
                switchData(data, stopI, stopJ);
            }

        }

        int resultIndex =0;
        if(data[pivoitIndex] > data[stopI]){
            switchData(data, pivoitIndex, stopI);
            resultIndex = stopI;
        } else{
            resultIndex = pivoitIndex;
        }

        return resultIndex;

    }





    public static void switchData(int[] data,int a, int b ){
        int temp = data[a];
        data[a]= data[b];
        data[b] = temp;
    }

    public static void main(String[] args){
        int[] data = {2,5,3,9,7};

        System.out.println(Arrays.toString(data));
        int[] newArray = mySort(data,0,data.length-1);
        System.out.println(Arrays.toString(newArray));
    }
}