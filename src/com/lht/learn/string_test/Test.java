package com.lht.learn.string_test;

import java.util.Vector;

/**
 * @author Lee
 * @version 1.0
 * @project learnproject
 * @package com.lht.learn.string_test
 * @date 2022/3/3 22:29
 */
public class Test {

    public static void main(String[] args) {

        String a = "loveyou";

        String b = new String("loveyou");

        String c = "love";

        String d = "you";

        String e = "love" + "you";

        String f = c + d;

        System.out.println(a == b);

        System.out.println(a == e);

        System.out.println(a == f);

        System.out.println(a == f.intern());

        System.out.println(b == b.intern());

        Vector vector = new Vector();
        vector.add("111");


    }
}
