package com.lht.learn.design23.zeren;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lee
 * @version 1.0
 * @project learntest
 * @package com.lht.learn.design23.zeren
 * @date 2021/4/14 23:58
 */
public class FilterChain implements Filter {

    List<Filter> list = new ArrayList<Filter>();

    @Override
    public Boolean doFilter(Response response, Request request, FilterChain filterChain) {

        for (Filter filter : list) {
            Boolean aBoolean = filter.doFilter(response, request, filterChain);
            if (!aBoolean) {
                return false;
            }
        }
        return true;
    }

    void addFilter(Filter filter){
        list.add(filter);
    }

}
