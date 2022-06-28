/**
 * @(#)SteamTest.java, 2022/2/16.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.structure;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamTest {

    public static void main(String[] args) {
        List<Stone> stoneList = new ArrayList<>();

        Stone stone1 = new Stone(23, "red");
        Stone stone2 = new Stone(32, "yellow");
        Stone stone3 = new Stone(12, "green");
        Stone stone4 = new Stone(8, "black");
        stoneList.add(stone1);
        stoneList.add(stone2);
        stoneList.add(stone3);
        stoneList.add(stone4);

        List<String> nameList = stoneList.stream().filter(member -> member.getWeight() < 30)
            .sorted(Comparator.comparing(Stone::getWeight)).map(Stone::getName).collect(Collectors.toList());

        System.out.println(nameList);
        nameList.forEach(System.out::println);



        Stream<Stone> stream1 = stoneList.stream();
        Stream<Stone> stream2 = stoneList.parallelStream();

        Integer[] nums = new Integer[10];
        Stream<Integer> a = Arrays.stream(nums);

        Stream<Integer> stream  = Stream.of(1,2,3);



        Stream<Integer> stream3 = Stream.of(6, 4, 6, 7, 3, 9, 8, 10, 12, 14, 14);

        Stream<Integer> stream4 =  stream3.filter(s->s>5).distinct().skip(2).limit(2);
        stream4.forEach(System.out::println);


        List<String> strList = Arrays.asList("a,b,c","1,2,3");

       Stream<String> stream5 =  strList.stream().map(s->s.replaceAll(",",""));
       stream5.forEach(System.out::println);


        Stream<String> stream6 =  strList.stream().flatMap(s->{
          String[] split = s.split(",");
          Stream<String> subStream =  Arrays.stream(split);
           return subStream;
       });
        stream6.forEach(System.out::println);



        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> list2 =   list.stream().collect(Collectors.toList());
        System.out.println(list2);



        Set<Integer> list3 =   list.stream().collect(Collectors.toSet());
        System.out.println(list3);

    }
}
