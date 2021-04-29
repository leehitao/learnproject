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
		Lock lock = new ReentrantLock();

		Thread[] threads = new Thread[20];
		CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new Runnable() {
			@Override
			public void run() {
				System.out.println("凑够5个人，开车");
			}
		});
		for (int i = 0; i < threads.length; i++) {

			threads[i] = new Thread(()->{
				try {
					TimeUnit.SECONDS.sleep(1);
					System.out.println(Thread.currentThread().getName()+"等着");
					cyclicBarrier.await();
					System.out.println(Thread.currentThread().getName()+":终于到我们了");

				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					e.printStackTrace();
				}
			},String.valueOf(i));
		}
		for (Thread thread : threads) {
			thread.start();
		}
		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
