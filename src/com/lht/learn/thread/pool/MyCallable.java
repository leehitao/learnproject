package com.lht.learn.thread.pool;

import java.util.concurrent.Callable;

/**
 * @author Lee
 * @version 1.0
 * @project learnproject
 * @package com.lht.learn.thread.pool
 * @date 2022/3/26 22:11
 */
public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        String threadNo = Thread.currentThread().getName();
        try {
            System.out.println("===>task:" + threadNo + " begin:");
        } catch (Exception e) {
            System.out.println("===>task:" + threadNo + " fail");
            MyResult myResult = new MyResult();
            myResult.setCode(500);
            myResult.setMsg("false");
            return myResult;
        }
        System.out.println("===>task:" + threadNo + "success");
        MyResult myResult = new MyResult();
        myResult.setCode(200);
        myResult.setMsg("success");
        return myResult;
    }
}
