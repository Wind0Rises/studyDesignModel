package com.liu.study.design.model.behavior.responsibility.whole.impl;

import com.liu.study.design.model.behavior.responsibility.tradition.CustomFilter;
import com.liu.study.design.model.behavior.responsibility.whole.Request;
import com.liu.study.design.model.behavior.responsibility.whole.Response;
import com.liu.study.design.model.behavior.responsibility.whole.WholeFilter;
import com.liu.study.design.model.behavior.responsibility.whole.WholeFilterChain;

/**
 * 特殊字符过滤。
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/26 13:05
 */
public class WholeSpecialCharFilter implements WholeFilter {

    @Override
    public void doFilter(Request request, Response response, WholeFilterChain chain) {

        String reqMessage = request.getMessage().replace("<", "[").replace(">", "]");
        request.setMessage(reqMessage);

        chain.doFilter(request, response, chain);

        String respMessage = response.getMessage().replace("<", "[").replace(">", "]");
        response.setMessage(respMessage);
    }
}