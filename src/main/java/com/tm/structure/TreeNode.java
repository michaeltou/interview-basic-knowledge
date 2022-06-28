/**
 * @(#)TreeNode.java, 2022/2/5.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.structure;

/**
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @author : douming
 * @version V1.0
 * @Description: TODO
 * @date Date : 2022年02月05日 10:55 上午
 */

public class TreeNode<T> {
    public T data;

    public TreeNode leftNode;

    public TreeNode rightNode;

    public TreeNode(T data) {
        this.data = data;
    }

    public TreeNode(T data, TreeNode left, TreeNode right) {
        this.data = data;
        this.leftNode = left;
        this.rightNode = right;
    }
}
