package com.liu.study.design.model.behavior.responsibility.tradition;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 责任链。
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/26 12:00
 */
public class CustomFilterChain {

    List<CustomFilter> filters = new ArrayList<>();

    public void addFilter(CustomFilter filter) {
        filters.add(filter);
    }

    public String executeFilter(String message) {
        String result = message;
        for (CustomFilter item : filters) {
            result = item.doFilter(result);
        }
        return result;
    }

}