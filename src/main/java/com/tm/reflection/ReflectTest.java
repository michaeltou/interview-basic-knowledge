
package com.tm.reflection;


import java.lang.reflect.Constructor;

public class ReflectTest {

    public static void main(String[] args) throws Exception {
      Class a =  Class.forName("java.lang.StringBuffer");
        System.out.println(a);
     Class b =   int.class;

     Class c = Integer.TYPE;

     StringBuffer d = new StringBuffer("abc");
     Class e = d.getClass();

        System.out.println(e);


        Class strClass = String.class;

        Constructor strConstrutor = strClass.getConstructor(String.class);

        Object myStr =  strConstrutor.newInstance("abc");

        System.out.println(myStr);




     }

}