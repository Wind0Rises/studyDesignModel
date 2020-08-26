package com.liu.study.design.model.behavior.responsibility.whole.impl;

import com.liu.study.design.model.behavior.responsibility.whole.Request;
import com.liu.study.design.model.behavior.responsibility.whole.Response;
import com.liu.study.design.model.behavior.responsibility.whole.WholeFilter;
import com.liu.study.design.model.behavior.responsibility.whole.WholeFilterChain;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/26 13:28
 */
public class WholeNumberFilter implements WholeFilter {

    @Override
    public void doFilter(Request request, Response response, WholeFilterChain chain) {

        String reqMessage = request.getMessage().replace('1', '一');
        request.setMessage(reqMessage);

        chain.doFilter(request, response, chain);

        String respMessage = response.getMessage().replace('1', '一');
        response.setMessage(respMessage);

    }
}