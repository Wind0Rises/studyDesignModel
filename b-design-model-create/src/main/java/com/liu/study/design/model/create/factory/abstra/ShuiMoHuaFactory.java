package com.liu.study.design.model.create.factory.abstra;

import com.liu.study.design.model.create.factory.abstra.color.ColorInterface;
import com.liu.study.design.model.create.factory.abstra.pen.PenInterface;

/**
 * 水墨画
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/12/18 9:45
 */
public class ShuiMoHuaFactory extends AbstractFactory {
    @Override
    public PenInterface getPen(int type) {

        return null;
    }

    @Override
    public ColorInterface getColor(int type) {
        return null;
    }
}
