/**
 * @(#)Test.java, 2022/2/16.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.structure;


public class Test {

    int count(TreeNode currentNode){

        if(currentNode == null){
            return 0;
        }
        int leftCount = count(currentNode.leftNode);
        int rightCount = count(currentNode.rightNode);
        return leftCount+rightCount+1;

    }
    public static void main(String[] args) {

    }
}