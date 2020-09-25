package com.liu.study.design.model.structure.adapter.tradition;

/**
 * 设配器。
 *
 * 通过【继承AdapterAdapee】Adapter获得了AdapterAdapee的【特殊功能】。
 * 实现了AdapterTarget接口，就是入口方法。
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/9/25 9:19
 */
public class Adapter  extends AdapterAdapee implements AdapterTarget {

    /**
     * 用户直接调用目标方法。
     *
     * targetMethod除了拥有自己特殊的方法，还拥有了AdapterAdapee的特殊方法。
     *
     */
    @Override
    public void targetMethod() {
        System.out.println("------------------");
        super.specificRequest();
        System.out.println("==================");
    }

}