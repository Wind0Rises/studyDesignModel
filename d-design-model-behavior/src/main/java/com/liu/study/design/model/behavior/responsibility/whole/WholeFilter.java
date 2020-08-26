package com.liu.study.design.model.behavior.responsibility.whole;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/26 13:26
 */
public interface WholeFilter {

    /**
     * 过滤操作。
     * @param request
     * @param response
     * @param chain
     * @return
     */
    void doFilter(Request request, Response response, WholeFilterChain chain);

}