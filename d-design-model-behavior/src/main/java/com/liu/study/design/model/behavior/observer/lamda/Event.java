package com.liu.study.design.model.behavior.observer.lamda;

/**
 * 事件对象：
 *      事件对象中包好事件源对象。
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/12/17 20:00
 */
public class Event<T> {

    public Event() {

    }

    public Event(T t) {
        this.source = t;
    }

    private T source;

    public T getSource() {
        return source;
    }
}
