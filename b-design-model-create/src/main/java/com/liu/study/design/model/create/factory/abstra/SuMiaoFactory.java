package com.liu.study.design.model.create.factory.abstra;

import com.liu.study.design.model.create.factory.abstra.color.ColorInterface;
import com.liu.study.design.model.create.factory.abstra.pen.PenInterface;

/**
 * 素描
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/12/18 9:48
 */
public class SuMiaoFactory  extends AbstractFactory {
    @Override
    public PenInterface getPen(int type) {
        return null;
    }

    @Override
    public ColorInterface getColor(int type) {
        return null;
    }
}
