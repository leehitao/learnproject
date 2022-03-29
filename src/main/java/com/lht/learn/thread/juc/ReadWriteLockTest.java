package com.lht.learn.thread.juc;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: lee
 * @Date: 2021/5/6 12:32
 * @Version 1.0
 */
public class ReadWriteLockTest {

	static Lock lock = new ReentrantLock();

	static ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

	static Lock readLock = readWriteLock.readLock();

	static Lock writeLock = readWriteLock.writeLock();

	static int value;

	public static void main(String[] args) {

		Runnable readRun = ()-> read(readLock);

		Runnable writeRun = ()->write(writeLock, new Random().nextInt());

		Thread[] threads = new Thread[20];

		for (int i = 0; i < threads.length; i++) {
			if ((i < 2)) {
				threads[i] = new Thread(writeRun,String.valueOf(i));
			}else{
				threads[i] = new Thread(readRun,String.valueOf(i));
			}
		}
		for (Thread thread : threads) {
			thread.start();
		}
	}

	public static void read(Lock lock) {
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName()+"开始读取");
			TimeUnit.SECONDS.sleep(1);
			System.out.println(Thread.currentThread().getName()+"读取完毕");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}

	}


	public static void write(Lock lock, int v) {
		try {
			lock.lock();
			value = v;
			System.out.println(Thread.currentThread().getName()+"开始写入");
			TimeUnit.SECONDS.sleep(1);
			System.out.println(Thread.currentThread().getName()+"写入完毕");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}

	}


}
