package com.liu.study.design.model.behavior.strategy.tradition;

import com.liu.study.design.model.behavior.strategy.tradition.impl.AddNumberCalculate;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/25 9:46
 */
public class StrategyTraditionTest {

    public static void main(String[] args) {
        /**
         * 测试一
         */
        StrategyContext strategyContext = new StrategyContext(new AddNumberCalculate());
        int result = strategyContext.executeStrategy(2, 5);
        System.out.println(result);

        /**
         * 测试
         */
        StrategyContext strategyContext2 = new StrategyContext();
        int result2 = strategyContext2.executeStrategy(10, 4, "-");
        System.out.println(result2);
    }

}