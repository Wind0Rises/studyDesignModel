package com.liu.study.design.model.behavior.strategy.lamda.impl;

import com.liu.study.design.model.behavior.strategy.lamda.TripModeService;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/25 13:06
 */
public class TripModeCar implements TripModeService {

    @Override
    public String trip() {
        System.out.println("------- 开车 -------");
        return "car";
    }

}