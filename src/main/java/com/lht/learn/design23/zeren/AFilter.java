package com.lht.learn.design23.zeren;

/**
 * @author Lee
 * @version 1.0
 * @project learntest
 * @package com.lht.learn.design23.zeren
 * @date 2021/4/15 0:00
 */
public class AFilter implements Filter {

    @Override
    public Boolean doFilter(Response response, Request request, FilterChain filterChain) {

        request.str.replace("哈哈,","");

        for (int i = 0; i < filterChain.list.size(); i++) {
            if (this.equals(filterChain.list.get(i)) && (i == filterChain.list.size()-1)) {
                filterChain.list.get(i+1).doFilter(response,request,filterChain);
            }
        }

        return null;
    }
}
