package com.liu.study.design.model.create.factory.abstra.pen.impl;

import com.liu.study.design.model.create.factory.abstra.pen.PenInterface;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/12/18 9:39
 */
public class BrushPen implements PenInterface {

    @Override
    public void usePen() {
        System.out.println("=============  使用毛笔  ===============");
    }
}
