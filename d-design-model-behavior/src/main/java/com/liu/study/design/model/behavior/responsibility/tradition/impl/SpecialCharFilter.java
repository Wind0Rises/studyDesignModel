package com.liu.study.design.model.behavior.responsibility.tradition.impl;

import com.liu.study.design.model.behavior.responsibility.tradition.CustomFilter;

/**
 * 特殊字符过滤。
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/26 13:05
 */
public class SpecialCharFilter implements CustomFilter {

    @Override
    public String doFilter(String message) {
        String replace = message.replace("<", "[").replace(">", "]");
        return replace;
    }

}