package com.lht.learn.thread.count;

import sun.misc.Lock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

/**
 * @author Lee
 * @version 1.0
 * @project learntest
 * @package com.lht.learn.thread.count
 * @date 2021/4/27 21:47
 */
public class count {

    static AtomicInteger count1 = new AtomicInteger(0);

    static LongAdder longAdder = new LongAdder();

    static Long aLong = new Long(0);

    public static void main(String[] args) throws InterruptedException {
        Lock lock = new Lock();
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 100000; j++) {
                    synchronized (lock) {
                        aLong++;
                    }
                }
            });
        }


        long start = System.currentTimeMillis();
        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        long end = System.currentTimeMillis();
        System.out.println("sync:" + (end - start));

        System.out.println("============================");

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {

                for (int j = 0; j < 100000; j++) {
                    count1.incrementAndGet();
                }

            });
        }
        start = System.currentTimeMillis();
        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        end = System.currentTimeMillis();
        System.out.println("atomic:" + (end - start));

        System.out.println("============================");


        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 100000; j++) {
                    longAdder.increment();
                }
            });
        }
        start = System.currentTimeMillis();
        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        end = System.currentTimeMillis();
        System.out.println("longAdd:" + (end - start));
    }
}
