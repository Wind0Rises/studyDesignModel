package com.liu.study.design.model.structure.adapter.tradition;

/**
 * 需要适配的类。
 *
 * 这里有些特殊的逻辑，是Adapter无法完成的。
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/9/25 9:18
 */
public class AdapterAdapee {

    /**
     * 需要设配的特殊方法。
     */
    public void specificRequest() {
        System.out.println("被适配的类Adaptee，这里是一些特殊的方法。");
    }

}