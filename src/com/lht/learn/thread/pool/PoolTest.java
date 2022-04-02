package com.lht.learn.thread.pool;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * @author Lee
 * @version 1.0
 * @project learnproject
 * @package com.lht.learn.thread.pool
 * @date 2022/3/26 22:02
 */
public class PoolTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ArrayList<Future> features = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Callable callable = new MyCallable();
            Future f = executorService.submit(callable);
            features.add(f);

        }
        executorService.shutdown();
        for (Future feature : features) {
            try {
                MyResult r = (MyResult) feature.get();
                System.out.println(r);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
