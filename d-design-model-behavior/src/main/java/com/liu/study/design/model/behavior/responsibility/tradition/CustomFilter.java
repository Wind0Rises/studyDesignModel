package com.liu.study.design.model.behavior.responsibility.tradition;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/26 11:56
 */
public interface CustomFilter {

    /**
     * 进行过滤操作。
     *
     * @param message
     * @return
     */
    String doFilter(String message);

}