package com.lht.learn.design23.zeren;

/**
 * @author Lee
 * @version 1.0
 * @project learntest
 * @package com.lht.learn.design23.zeren
 * @date 2021/4/15 0:06
 */
public class Client {
    public static void main(String[] args) {

        Request request = new Request("哈哈,你真逗呀！");
        Response response = new Response("呵呵,彼此彼此！");

        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new AFilter());
        filterChain.addFilter(new BFilter());

        filterChain.doFilter(response,request,filterChain);


    }
}
