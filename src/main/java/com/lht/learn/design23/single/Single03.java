package com.lht.learn.design23.single;

/**
 * @author Lee
 * @version 1.0
 * @project learntest
 * @package com.lht.learn.design23.single
 * @date 2021/4/11 9:49
 */
public class Single03 {

    private static Single03 single03;

    private Single03() {
    }

    public static Single03 getInstance() {
        if (null == single03) {
            synchronized (Single03.class) {
                if (null == single03) {
                    single03 = new Single03();
                }
            }
        }
        return single03;
    }


}
