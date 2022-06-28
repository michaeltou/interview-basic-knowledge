/**
 * @(#)BubbleSortTest.java, 2022/2/5.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.sort;

import java.util.Arrays;


public class MergeSortTest {

    public static void mergeSort(int[] data, int[]temp, int leftIndex ,int rightIndex){
        if(leftIndex == rightIndex){
            return;
        }
        int center = (leftIndex+rightIndex)/2;
        int leftStart = leftIndex;
        int leftEnd = center;
        int rightStart = center+1;
        int rightEnd = rightIndex;
        mergeSort(data,temp,leftStart,leftEnd);
        mergeSort(data,temp,rightStart,rightEnd);
        merge(data,temp,leftStart,leftEnd,rightStart,rightEnd);



    }

    public static void merge(int[]data,int[] temp,int leftStart,int leftEnd,int rightStart,int rightEnd){
        int count = rightEnd-leftStart+1;

        int tempIndex = leftStart;
        while(leftStart <= leftEnd && rightStart <= rightEnd){
            if(data[leftStart] <= data[rightStart]){
                temp[tempIndex++] = data[leftStart++];
            } else {
                temp[tempIndex++] = data[rightStart++];
            }
        }

        while(leftStart <= leftEnd ){
            temp[tempIndex++] = data[leftStart++];
        }

        while(rightStart <= rightEnd ){
            temp[tempIndex++] = data[rightStart++];
        }
        for(int i=leftEnd;i<=rightEnd;i++){
            data[i]= temp[i];
        }

    }

    public static void switchData(int[] data,int a, int b ){
        int temp = data[a];
        data[a]= data[b];
        data[b] = temp;
    }

    public static void main(String[] args){
        int[] data = {2,5,3,9,7};

        System.out.println(Arrays.toString(data));
          mergeSort(data,new int[data.length],0,data.length-1);
        System.out.println(Arrays.toString(data));
    }
}