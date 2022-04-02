package com.lht.learn.class_do;

/**
 * @author Lee
 * @version 1.0
 * @project learnproject
 * @package com.lht.learn.class_do
 * @date 2022/3/3 21:33
 */
public class A {

    {
        System.out.println("A 静态代码块"+i);
        i = 2;
        System.out.println("A 静态代码块"+i);
    }

    static Integer i = 1;

    public A() {
        System.out.println("A 构造方法"+i);
        i = 3;
        System.out.println("A 构造方法"+i);
    }
}
