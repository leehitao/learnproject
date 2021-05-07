package com.lht.learn.thread.juc;

import java.util.concurrent.Exchanger;

/**
 * @author Lee
 * @version 1.0
 * @project learnproject
 * @package com.lht.learn.thread.juc
 * @date 2021/5/7 22:59
 */
public class ExchangeTest {

    public static void main(String[] args) {

        Exchanger<String> exchanger = new Exchanger();

        new Thread(()->{
            String str = "屠龙宝刀";
            try {
                System.out.println("李四，等我一会会，我去拿装备");
                Thread.sleep(5000);
                System.out.println("我来了");
                String exchange = exchanger.exchange(str);
                System.out.println(Thread.currentThread().getName()+"交换得到"+exchange);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        },"张三").start();

        new Thread(()->{
            String str = "倚天剑";
            try {
                System.out.println("张三，我们换个装备，我有"+str);
                String exchange = exchanger.exchange(str);
                System.out.println(Thread.currentThread().getName()+"交换得到"+exchange);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"李四").start();
    }
}
