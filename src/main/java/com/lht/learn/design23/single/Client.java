package com.lht.learn.design23.single;

/**
 * @author Lee
 * @version 1.0
 * @project learntest
 * @package com.lht.learn.design23.single
 * @date 2021/4/11 9:55
 */
public class Client {

    public static void main(String[] args) {


        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(()->{
                Single03 instance = Single03.getInstance();
                System.out.println(instance.hashCode());
            });
            thread.start();
        }


    }
}
