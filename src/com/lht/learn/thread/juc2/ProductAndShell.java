package com.lht.learn.thread.juc2;


import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Lee
 * @version 1.0
 * @project learnproject
 * @package com.lht.learn.thread.juc2
 * @date 2021/5/22 13:01
 */
public class ProductAndShell {
    private static Integer SIZE = 10;

    public static void main(String[] args) {

        Object lock = new Object();
        LinkedList list = new LinkedList();

        new Thread(()->{
            while (true){
                put(lock, list);
            }
        },"t1").start();

        new Thread(()->{
            while (true){
                put(lock, list);
            }
        },"t2").start();

        for (int i = 0; i < 100; i++) {

            synchronized (lock){
                while (list.isEmpty()) {
                    try {
                        lock.notifyAll();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                list.removeFirst();
                lock.notifyAll();
                System.out.println("购买了一个雪糕，店里还剩:"+list.size());
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    private static void put(Object lock, LinkedList list) {
        synchronized (lock){
            while (list.size()==SIZE) {
                try {
                    System.out.println("库存满了");
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.add(new Object());
            lock.notifyAll();
            System.out.println(Thread.currentThread().getName()+" 生产了一个雪糕,现有:"+list.size());
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
