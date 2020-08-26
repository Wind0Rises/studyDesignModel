package com.liu.study.design.model.behavior.responsibility.tradition;

import com.liu.study.design.model.behavior.responsibility.tradition.impl.NumberFilter;
import com.liu.study.design.model.behavior.responsibility.tradition.impl.SpecialCharFilter;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/26 13:07
 */
public class ResponsibilityTraditionDemo {

    public static void main(String[] args) {
        /**
         * 传统方式。
         *
         * 如果需要添加新的过滤器，需要修改下面的代码。
         */
        String message = "this is 1 and 2 <se>";
        String numberFilterStr = new NumberFilter().doFilter(message);
        String charStr = new SpecialCharFilter().doFilter(numberFilterStr);
        System.out.println(charStr);

        /**
         * 增加一个Filter Chain，如果需要增加新的filter，调用FilterChain的addFilter进行添加。
         */
        NumberFilter numberFilter = new NumberFilter();
        SpecialCharFilter specialCharFilter = new SpecialCharFilter();
        CustomFilterChain customFilterChain = new CustomFilterChain();
        customFilterChain.addFilter(numberFilter);
        customFilterChain.addFilter(specialCharFilter);
        String result = customFilterChain.executeFilter(message);
        System.out.println(result);

        /**
         * 如何添加新的链条。
         */
        NumberFilter numberFilter1 = new NumberFilter();
        SpecialCharFilter specialCharFilter1 = new SpecialCharFilter();
        CustomFilterChain customFilterChain1 = new CustomFilterChain();
        customFilterChain1.addFilter(numberFilter1);
        customFilterChain1.addFilter(specialCharFilter1);
    }

}