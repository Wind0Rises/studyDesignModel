package com.liu.study.design.model.behavior.template.tradition;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/9/24 16:59
 */
public abstract class AbstractSuperClass {

    protected abstract void first();

    protected abstract void second();

    protected abstract void three();

    /**
     * 把整体流程定义下来，
     * 具体的服务根据自己的自己特点进行拓展。
     * 也可以把公共的操作提取处理。
     */
    public void playComputerGame() {
        // 01、第一步
        first();

        // 02、第二步
        second();

        // 03、第三步
        three();
    }

}