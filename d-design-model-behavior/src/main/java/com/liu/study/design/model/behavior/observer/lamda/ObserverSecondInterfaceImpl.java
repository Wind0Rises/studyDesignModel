package com.liu.study.design.model.behavior.observer.lamda;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/12/17 20:00
 */
public class ObserverSecondInterfaceImpl implements ObserverInterface {

    @Override
    public void observerHandlerEvent(Event event) {
        String logger = String.format("观察者：【%s】，处理事件开始！！！", "ObserverSecondInterfaceImpl");
        System.out.println(logger);
    }

}
