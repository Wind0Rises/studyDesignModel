package com.liu.study.design.model.behavior.observer.tradition;

import com.liu.study.design.model.behavior.observer.tradition.impl.FirstObserver;
import com.liu.study.design.model.behavior.observer.tradition.impl.SecondObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/28 13:24
 */
public class ObserverTraditionDemo {

    private List<ObserverService> observerServices = new ArrayList<>();

    public void addObserver(ObserverService observerService) {
        observerServices.add(observerService);
    }

    public void working () {
        System.out.println("开始工作了，触发监听工作这个事件的所有监听器，");
        observerServices.forEach(item -> item.processMethod(new EventObject()));
    }

    public static void main(String[] args) {
        ObserverTraditionDemo observerTraditionDemo = new ObserverTraditionDemo();
        observerTraditionDemo.addObserver(new FirstObserver());
        observerTraditionDemo.addObserver(new SecondObserver());

        observerTraditionDemo.working();
    }

}