package com.lht.learn.thread.juc2;

import sun.misc.Lock;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lee
 * @version 1.0
 * @project learnproject
 * @package com.lht.learn.thread.juc2
 * @date 2021/5/19 21:22
 */
public class WaitNotifiy {

    public static List list = new ArrayList();
    private static Lock lock = new Lock();

    public static void main(String[] args) {

        new Thread(()->{
            synchronized (lock){
                if (list.size()!=5) {
                    try {
                        lock.wait();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("检测到了");
                lock.notify();
            }
        }).start();

        new Thread(()->{
            synchronized (lock){
                for (int i = 0; i < 10; i++) {
                    list.add(new Object());
                    System.out.println("add:"+i);
                    if (list.size()==5) {
                        lock.notify();
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                }
            }


        }).start();




    }
}
