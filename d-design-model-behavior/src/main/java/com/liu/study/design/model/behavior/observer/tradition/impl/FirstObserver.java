package com.liu.study.design.model.behavior.observer.tradition.impl;

import com.liu.study.design.model.behavior.observer.tradition.EventObject;
import com.liu.study.design.model.behavior.observer.tradition.ObserverService;

/**
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/28 13:17
 */
public class FirstObserver implements ObserverService {

    @Override
    public void processMethod(EventObject event) {
        System.out.println("第一个观察者。");
    }

}