/**
 * @(#)TwoDirectionLInkLIst.java, 2022/2/4.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.structure;

/**
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved. NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @author : douming
 * @version V1.0
 * @Description: TODO
 * @date Date : 2022年02月04日 10:03 下午
 */
public class TwoDirectionLInkLIst<T> {

    class Node {
        public T value;

        public Node prevNode;

        public Node nextNode;

        public Node(T value) {
            this.value = value;
        }
    }

    private int size;

    private Node head;

    private Node tail;

    public void addHead(T value) {
        Node newNode = new Node(value);
        if (size == 0) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        } else {
            head.prevNode = newNode;
            newNode.nextNode = head;
            head = newNode;
            size++;
            return;
        }
    }

    public void addTail(T value) {
        Node newNode = new Node(value);
        if(size == 0 ){
            head = newNode;
            tail = newNode;
            size++;
            return;
        } else{
            tail.nextNode  = newNode;
            newNode.prevNode = tail;
            tail = newNode;
            size++;
            return;
        }
    }

    public void deleteHead(){
        if(size>0){
           Node currentNode =  head.nextNode;
           head = currentNode;
           head.prevNode = null;
           size--;
        }
    }
    public void deleteTail(){
        if(size>0){
            Node currentNode =  tail.prevNode;
            tail = currentNode;
            tail.nextNode = null;
            size--;
        }
    }







}
