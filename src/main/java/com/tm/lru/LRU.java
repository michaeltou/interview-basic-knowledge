/**
 * @(#)LRU.java, 2022/2/22.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.lru;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU<K, V> extends LinkedHashMap<K,V> {

    public LRU(int initialCapacity, float loadFactor, boolean accessOrder) {
        super(initialCapacity, loadFactor, accessOrder);
    }


    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > 6;
    }

    public static void main(String[] args) {

        LRU<Character,Integer> lru = new LRU<>(16,0.75f,true);


        String s = "abcdefghijkl";

        for(int i=0;i<s.length();i++){
            lru.put(s.charAt(i),i);
        }

        System.out.println(lru.get('h'));
        System.out.println(lru.get('g'));

        System.out.println(lru.size());

        System.out.println(lru);

    }




}