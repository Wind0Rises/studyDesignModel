package com.liu.study.design.model.behavior.observer.lamda;

/**
 * 观察者接口。
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/12/17 19:59
 */
public interface ObserverInterface {

    /**
     * 观察者处理事件方法。
     */
    void observerHandlerEvent(Event event);

}
