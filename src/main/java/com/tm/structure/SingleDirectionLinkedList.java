/**
 * @(#)SingleLinkedList.java, 2022/2/4.
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
 * @date Date : 2022年02月04日 8:24 下午
 */
public class SingleDirectionLinkedList<T> {

    class Node {
        public T value;

        public Node next;

        public Node(T value) {
            this.value = value;
        }
    }

    private Node headNode;

    private int size;

    public SingleDirectionLinkedList() {
        headNode = null;
        size = 0;
    }

    public void add(int index, T e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("add failed.");
        }
        if (size == 0) {
            headNode = new Node(e);
            size++;
            return;
        } else {

            if (index == 0) {
                Node currentNode = new Node(e);
                currentNode.next = headNode;
                headNode = currentNode;
                size++;
                return;
            } else {
                Node preNode = headNode;
                Node currentNode = headNode;
                for (int i = 0; i < index; i++) {
                    preNode = currentNode;
                    currentNode = currentNode.next;
                }

                Node newNode = new Node(e);
                preNode.next = newNode;
                newNode.next = currentNode;
                size++;
            }
        }

    }

    public void addFirst(T e) {
        add(0, e);
    }

    public void addLast(T e) {
        add(size, e);
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("get failed");
        }

        if (index == 0) {
            return headNode.value;
        } else {
            Node currentNode = headNode;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            return currentNode.value;
        }

    }

    public T getFirst() {
        return get(0);
    }

    public T getLast() {
        return get(size - 1);
    }

    public void set(int index, T e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("failed");
        }

        Node currentNode = headNode;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        currentNode.value = e;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("failed");
        }

        if (size == 0) {
            headNode = null;
            return;
        }

        if (index == 0) {
            headNode = headNode.next;
            size--;
        } else {
            Node currentNode = headNode;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
            size--;
        }

    }

    public static void main(String[] args) {
        SingleDirectionLinkedList<String> myList = new SingleDirectionLinkedList<>();
        myList.add(0, "abc");
        myList.add(1, "def");
        myList.add(2, "ghi");

        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
    }

}
