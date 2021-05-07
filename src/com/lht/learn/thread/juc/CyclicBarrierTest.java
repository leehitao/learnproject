package com.lht.learn.thread.juc;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: lee
 * @Date: 2021/4/27 17:59
 * @Version 1.0
 */
public class CyclicBarrierTest {

    public static void main(String[] args) {

        Thread[] threads = new Thread[8];
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
            @Override
            public void run() {
                System.out.println("凑够3个人了马上发车梧桐山");
            }
        });


        Runnable runnable = () -> {
            try {
                String name = Thread.currentThread().getName();
                System.out.println(name + "正在走来");
                TimeUnit.SECONDS.sleep(Integer.valueOf(name));
                System.out.println(name + "到了");
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        };

        for (int i = 0; i < 8; i++) {
            new Thread(runnable,String.valueOf(i+1)).start();
        }
    }
}
