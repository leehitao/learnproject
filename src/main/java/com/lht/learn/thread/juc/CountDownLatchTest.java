package com.lht.learn.thread.juc;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: lee
 * @Date: 2021/4/28 15:39
 * @Version 1.0
 */
public class CountDownLatchTest {
	public static void main(String[] args) {

		CountDownLatch count = new CountDownLatch(3);

		Runnable runnable = ()->{
			try {
				String name = Thread.currentThread().getName();
				System.out.println(name+"号开始工作");
				Thread.sleep(Integer.valueOf(name)*3000);
				System.out.println(name+"号完成任务");
				count.countDown();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		try {
			for (int i = 0; i < 5; i++) {
				new Thread(runnable,String.valueOf(i+1)).start();
			}
			count.await();
			System.out.println("很好，你们当中已经有三位完成了任务");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
