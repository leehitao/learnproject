package com.lht.learn.thread.juc2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Lee
 * @version 1.0
 * @project learnproject
 * @package com.lht.learn.thread.juc2
 * @date 2021/5/19 21:05
 */
public class WithVolite {

    private static List list = Collections.synchronizedList(new ArrayList());

    public static void main(String[] args) {

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {

                list.add(new Object());
                System.out.println("add:" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                if (list.size() == 5) {
                    break;
                }
            }
            System.out.println("检测到第五个元素");

        }).start();

    }

}
