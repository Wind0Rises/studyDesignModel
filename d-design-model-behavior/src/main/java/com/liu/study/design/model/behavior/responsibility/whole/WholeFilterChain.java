package com.liu.study.design.model.behavior.responsibility.whole;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/26 13:26
 */
public class WholeFilterChain implements WholeFilter {

    private List<WholeFilter> filters = new ArrayList<>();

    private int index = 0;

    /**
     * 因为WholeFilter实现了Filter接口，所有filters中的filter可能是
     * Chain。
     *
     * @param filter
     * @return
     */
    public WholeFilterChain addFilter(WholeFilter filter) {
        filters.add(filter);
        return this;
    }


    @Override
    public void doFilter(Request request, Response response, WholeFilterChain chain) {
        // 01、过滤链执行完成。
        if (index == filters.size()) {
            return ;
        }

        /**
         * 如果filters.get(index)获取的是普通的Filter，直接执行普通的filter。
         * 如果Chain，这个就可以看成递归了。
         */
        WholeFilter filter = filters.get(index);
        index++;

        filter.doFilter(request, response, chain);
    }
}