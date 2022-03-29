package com.lht.learn.design23.strategy.campratortest;

/**
 * @author Lee
 * @version 1.0
 * @project learntest
 * @package com.lht.learn.design23.strategy
 * @date 2021/4/11 19:27
 */

public interface Camprator<T> {

    int compareTo(T t1,T t2);

}
