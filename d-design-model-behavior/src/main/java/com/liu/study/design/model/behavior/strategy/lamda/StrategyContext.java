package com.liu.study.design.model.behavior.strategy.lamda;

import com.liu.study.design.model.behavior.strategy.lamda.impl.TripModeCar;
import com.liu.study.design.model.behavior.strategy.lamda.impl.TripModeHighTrain;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 *
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/25 13:09
 */
public class StrategyContext {

    /**
     * java 8: 模式。
     *
     * @param function
     * @param tripModeService
     */
    public void tripMode(Function<TripModeService, String> function, TripModeService tripModeService) {
        /**
         * 可以写一些其他逻辑：
         */
        System.out.println("   tripMode 其他逻辑1    ");

        String apply = function.apply(tripModeService);
        System.out.println("   tripMode：结果" + apply);

        System.out.println("   tripMode 其他逻辑2    ");
    }

    /**
     * 传统模式。
     */
    // 可以使用工厂模式。
    Map<String, TripModeService> tripModeServices = new HashMap<String, TripModeService>() {{
        put("highTrain", new TripModeHighTrain());
        put("car", new TripModeCar());
    }};

    public void tripModeByType(String type) {

        System.out.println("   tripModeByType 其他逻辑1    ");

        /**
         * 根据type获取具体的策略。
         */
        TripModeService tripModeService = tripModeServices.get(type);

        /**
         * 调用
         */
        String result = tripModeService.trip();
        System.out.println("   tripModeByType：结果" + result);

        System.out.println("   tripModeByType 其他逻辑2    ");
    }
}