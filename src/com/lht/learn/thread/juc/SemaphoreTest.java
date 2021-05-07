package com.lht.learn.thread.juc;

import sun.awt.windows.ThemeReader;

import java.util.concurrent.Semaphore;

/**
 * @author Lee
 * @version 1.0
 * @project learnproject
 * @package com.lht.learn.thread.juc
 * @date 2021/5/7 22:29
 */
public class SemaphoreTest {

    public static void main(String[] args) {
        // 车道限流
        Semaphore semaphore = new Semaphore(3);

        Runnable r = ()->{
            try {
                String name = Thread.currentThread().getName();
                semaphore.acquire();
                System.out.println(name +"号车正在驶进隧道");
                Thread.sleep(Integer.valueOf(name)*3000);
                System.out.println(name +"号车驶出了隧道");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                semaphore.release();
            }
        };

        for (int i = 0; i < 8; i++) {
            new Thread(r,String.valueOf(i+1)).start();
        }




    }
}
