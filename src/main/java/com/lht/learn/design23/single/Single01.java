package com.lht.learn.design23.single;

/**
 * @author Lee
 * @version 1.0
 * @project learntest
 * @package com.lht.learn.design23.single
 * @date 2021/4/11 9:30
 */
public class Single01 {

    private static final Single01 instance = new Single01();

    private Single01(){};

    public static Single01 getInstance() {
        return instance;
    }

}
