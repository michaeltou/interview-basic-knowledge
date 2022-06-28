/**
 * @(#)MyTest.java, 2022/2/5.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.structure;

import java.util.*;

/**
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved. NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @author : douming
 * @version V1.0
 * @Description: TODO
 * @date Date : 2022年02月05日 10:52 上午
 */
public class MyTest {

    public static void main(String[] args) {
     List<String> a = new ArrayList<>();

        Stack<String> stack = new Stack<String>();


    }

    public void testLinkedList(){

        LinkedList<TreeNode> list = new LinkedList<TreeNode>();

        list.add(null);
    }

    public void stackTest(){
        Deque<TreeNode> stack = new LinkedList<TreeNode>();

        TreeNode node = new TreeNode("a",null,null);
        stack.push(node);

        System.out.println(stack.pop().data);
    }

}
