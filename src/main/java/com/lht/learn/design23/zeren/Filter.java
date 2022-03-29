package com.lht.learn.design23.zeren;

/**
 * @author Lee
 * @version 1.0
 * @project learntest
 * @package com.lht.learn.design23.zeren
 * @date 2021/4/14 23:55
 */
public interface Filter {

    Boolean doFilter(Response response, Request request,FilterChain filterChain);
}
