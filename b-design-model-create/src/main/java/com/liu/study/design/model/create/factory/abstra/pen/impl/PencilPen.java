package com.liu.study.design.model.create.factory.abstra.pen.impl;

import com.liu.study.design.model.create.factory.abstra.pen.PenInterface;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/12/18 9:41
 */
public class PencilPen implements PenInterface {
    @Override
    public void usePen() {
        System.out.println("===========   PencilPen  ================");
    }
}
