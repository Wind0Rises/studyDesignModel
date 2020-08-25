package com.liu.study.design.model.behavior.strategy.tradition;

import com.liu.study.design.model.behavior.strategy.tradition.impl.AddNumberCalculate;
import com.liu.study.design.model.behavior.strategy.tradition.impl.SubNumberCalculate;

/**
 * 计算器。
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/25 9:41
 */
public class StrategyContext {

    private NumberCalculate numberCalculate;

    public StrategyContext() {
    }

    public StrategyContext(NumberCalculate numberCalculate) {
        this.numberCalculate = numberCalculate;
    }

    /**
     * 根据传入的策略进行不同策略的计算。
     *
     * @param a
     * @param b
     * @return
     */
    public int executeStrategy(int a, int b) {
        return numberCalculate.calculate(a, b);
    }

    /**
     * 根据符号获取策略，进行计算。
     * @param a
     * @param b
     * @param symbol
     * @return
     */
    public int executeStrategy(int a, int b, String symbol) {
        if ("+".equals(symbol)) {
            return new AddNumberCalculate().calculate(a, b);
        }

        if ("-".equals(symbol)) {
            return new SubNumberCalculate().calculate(a, b);
        }

        return 0;
    }
}