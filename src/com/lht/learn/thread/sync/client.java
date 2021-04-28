package com.lht.learn.thread.sync;

/**
 * @author Lee
 * @version 1.0
 * @project learntest
 * @package com.lht.learn.thread
 * @date 2021/4/26 22:31
 */
public class client {

    public static void sayHello(){

        synchronized (client.class){
            System.out.println("你好");
        }

    }

    public void sayGoodBye(){
        synchronized (this){
            System.out.println("再见");
        }
    }

}
