package com.lht.learn.thread.juc2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @author Lee
 * @version 1.0
 * @project learnproject
 * @package com.lht.learn.thread.juc2
 * @date 2021/5/21 23:08
 */
public class CountDownDemo {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        List list = new ArrayList();

        new Thread(()->{
            if (list.size()!=5) {
                try {
                    countDownLatch.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("get it");
        }).start();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                list.add(new Object());
                System.out.println("add:"+i);
                if (list.size()==5) {
                    countDownLatch.countDown();
                }
            }
        }).start();

    }
}
