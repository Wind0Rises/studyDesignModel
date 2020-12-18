package com.liu.study.design.model.create.factory.abstra.color.impl;

import com.liu.study.design.model.create.factory.abstra.color.ColorInterface;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/12/18 9:36
 */
public class BlackColor implements ColorInterface {

    @Override
    public void addColor() {
        System.out.println("============   BlackColor  ============");
    }

}
