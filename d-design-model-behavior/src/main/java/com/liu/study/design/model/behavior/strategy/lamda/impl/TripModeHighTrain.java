package com.liu.study.design.model.behavior.strategy.lamda.impl;

import com.liu.study.design.model.behavior.strategy.lamda.TripModeService;

import java.util.function.Function;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/25 13:02
 */
public class TripModeHighTrain implements TripModeService {

    @Override
    public String trip() {
        System.out.println("------- 做高铁出行 -------");
        return "HighTrain";
    }

}