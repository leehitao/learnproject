package com.lht.learn.thread.juc;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Lee
 * @version 1.0
 * @project learnproject
 * @package com.lht.learn.thread.juc
 * @date 2021/5/27 21:29
 */
public class CosTest {

    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {

        Condition a = lock.newCondition();
        Condition b = lock.newCondition();
        String str1 = "123456789";
        String str2 = "abcdefghi";

        new Thread(() -> {
            char[] chars = str1.toCharArray();
            for (char aChar : chars) {
                try {
                    lock.lock();
                    System.out.println(Thread.currentThread().getName() + ":" + aChar);
                    b.signal();
                    a.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }, "t1").start();

        new Thread(() -> {
            char[] chars = str2.toCharArray();
            for (char aChar : chars) {
                try {
                    lock.lock();
                    System.out.println(Thread.currentThread().getName() + ":" + aChar);
                    a.signal();
                    b.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }, "t2").start();


    }
}
