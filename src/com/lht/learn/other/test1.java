package com.lht.learn.other;

import java.util.Random;

/**
 * @author Lee
 * @version 1.0
 * @project learnproject
 * @package com.lht.learn.other
 * @date 2021/11/15 21:28
 */
public class test1 {

    public static void main(String[] args) {

        long l = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 1000000; i++) {
             s = String.valueOf(new Random().nextInt(100000) + 100000);
        }
        System.out.println(s);
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);

        for (int i = 0; i < 1000000; i++) {
             s = (Math.random()+"").substring(2,8);

        }
        System.out.println(s);
        long l2 = System.currentTimeMillis();
        System.out.println(l2-l1);
        for (int i = 0; i < 1000000; i++) {
            double v = (Math.random() * 9 + 1) * Math.pow(10, 5);
             s = String.valueOf((int) v);
        }
        System.out.println(s);
        long l3 = System.currentTimeMillis();
        System.out.println(l3-l2);
    }
}
