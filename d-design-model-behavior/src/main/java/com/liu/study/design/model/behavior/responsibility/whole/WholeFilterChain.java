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

        WholeFilter filter = filters.get(index);
        index++;

        filter.doFilter(request, response, chain);
    }
}