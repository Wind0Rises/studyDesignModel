package com.liu.study.design.model.create.factory.simple;

import com.liu.study.design.model.create.factory.simple.impl.ShapeFirstImpl;
import com.liu.study.design.model.create.factory.simple.impl.ShapeSecondImpl;

/**
 *
 * Share工厂模式。
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/12/18 9:28
 */
public class ShapeFactory {

    public ShapeInterface getShareInterface(int type) {

        if (1 == type) {
            return new ShapeFirstImpl();
        }

        if (2 == type) {
            return new ShapeSecondImpl();
        }

        return null;
    }

}
