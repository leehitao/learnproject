package com.lht.learn.design23.single;

/**
 * @author Lee
 * @version 1.0
 * @project learntest
 * @package com.lht.learn.design23.single
 * @date 2021/4/11 9:32
 */
public class Single02 {

    private Single02(){}

    private static class Single02Holder{
        private static final Single02 instance = new Single02();
    }

    public static Single02 getInstance(){
        return Single02Holder.instance;
    }

}


