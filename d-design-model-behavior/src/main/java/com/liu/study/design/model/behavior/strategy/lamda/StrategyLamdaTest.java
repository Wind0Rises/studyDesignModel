package com.liu.study.design.model.behavior.strategy.lamda;

import com.liu.study.design.model.behavior.strategy.lamda.impl.TripModeHighTrain;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/25 12:58
 */
public class StrategyLamdaTest {


    public static void main(String[] args) {
        new StrategyContext().tripMode((item) -> item.trip(), new TripModeHighTrain());

        System.out.println("\n=========================================================\n");

        new StrategyContext().tripModeByType("car");
    }

}