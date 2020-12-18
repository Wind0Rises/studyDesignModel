package com.liu.study.design.model.create.factory.simple.impl;

import com.liu.study.design.model.create.factory.simple.ShapeInterface;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/12/18 9:22
 */
public class ShapeFirstImpl implements ShapeInterface {
    @Override
    public void test() {
        System.out.println("------  ShapeFirstImpl   ---------- " );
    }
}
