package com.liu.study.design.model.behavior.strategy.tradition;

/**
 * 两个数字计算。
 *
 * 策略接口
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/25 9:34
 */
public interface NumberCalculate {

    /**
     * 两个数进行计算。
     *
     * @param a 数字a
     * @param b 数字b
     * @return
     */
    int calculate(int a, int b);

}