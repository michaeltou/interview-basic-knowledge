/**
 * @(#)Test.java, 2022/2/6.
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.tm.prg;

import java.util.*;

/**
 * <p/>
 * Copyright 2022 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @author : douming
 * @version V1.0
 * @Description: TODO
 * @date Date : 2022年02月06日 7:23 下午
 */
public class Test {

    public boolean isValid(String s) {
        int length = s.length();

        if(length % 2 == 1){
            return false;
        }

        Map<Character,Character> pairs = new HashMap<Character ,Character>();
        pairs.put(')','(');
        pairs.put('}','{');
        pairs.put(']','[');

        Stack stack =  new Stack<Character>();

        for(int i=0;i<length;i++){
            char currentChar = s.charAt(i);

            if(pairs.containsKey(currentChar)){
                if(stack.isEmpty() || stack.peek() != pairs.get(currentChar)){
                    return false;
                }

                if(stack.peek() == pairs.get(currentChar)){
                    stack.pop();
                }

            }else{
                stack.push(currentChar);
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args) {

    }
}