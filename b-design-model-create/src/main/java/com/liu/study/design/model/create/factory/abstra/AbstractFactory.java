package com.liu.study.design.model.create.factory.abstra;

import com.liu.study.design.model.create.factory.abstra.color.ColorInterface;
import com.liu.study.design.model.create.factory.abstra.pen.PenInterface;

/**
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/12/18 9:42
 */
public abstract class AbstractFactory {

    public abstract PenInterface getPen(int type);

    public abstract ColorInterface getColor(int type);

}
