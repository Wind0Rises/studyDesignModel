package com.liu.study.design.model.structure.adapter.tradition;

/**
 * 适配器模式的目标类。
 *
 * 这个就是用户直接调用的接口。
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/9/25 9:09
 */
public interface AdapterTarget {

    /**
     * 用户调用的目标方法。
     */
    void targetMethod();

}