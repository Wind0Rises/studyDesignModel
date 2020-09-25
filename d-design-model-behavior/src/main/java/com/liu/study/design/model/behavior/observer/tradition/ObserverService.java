package com.liu.study.design.model.behavior.observer.tradition;

/**
 *
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/26 11:48
 */
public interface ObserverService {

    /**
     * 观察者要处理的事。
     * @param event
     */
    public void processMethod(EventObject event);

}