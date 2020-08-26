package com.liu.study.design.model.behavior.responsibility.tradition.impl;

import com.liu.study.design.model.behavior.responsibility.tradition.CustomFilter;

/**
 * 数字过滤
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/26 13:03
 */
public class NumberFilter implements CustomFilter {

    @Override
    public String doFilter(String message) {
        String result = message.replace('1', '一');
        return result;
    }


}