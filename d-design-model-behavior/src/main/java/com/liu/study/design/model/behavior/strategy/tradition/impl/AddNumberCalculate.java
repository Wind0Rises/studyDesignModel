package com.liu.study.design.model.behavior.strategy.tradition.impl;

import com.liu.study.design.model.behavior.strategy.tradition.NumberCalculate;

/**
 * 策略接口--加运算策略
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/25 9:37
 */
public class AddNumberCalculate implements NumberCalculate {

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}