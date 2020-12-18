package com.liu.study.design.model.behavior.observer.lamda;

import java.util.ArrayList;
import java.util.List;

/**
 * 源对象。
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/12/17 20:06
 */
public class Source {

    /**
     * 观察者集合、监听器集合。
     */
    private static List<ObserverInterface> observers = new ArrayList<>();

    /**
     * 这个可以借助Spring框架进行注入。
     */
    static {
        observers.add(new ObserverFirstInterfaceImpl());
        observers.add(new ObserverSecondInterfaceImpl());
    }

    public void triggerMethod() {
        Event<Source> event = new Event<>(this);
        observers.stream().forEach(item -> item.observerHandlerEvent(event));
    }



}
