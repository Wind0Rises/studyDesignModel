package com.liu.study.design.model.structure.factory.simple.tradition;

import java.util.ArrayList;
import java.util.List;

/**
 * 工程模式。
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/9/24 15:46
 */
public class ComputerFactory {

    /**
     * TODO:拓展点1。
     * 结合Spring，怎么把对应的服务注入到这个list。
     * 可以使用BeanPostProcess、@Autowired注入集合注入。
     */
    private List<Computer> list = new ArrayList<Computer>() {{add(new HpComputer()); add(new LenovoComputer());}};

    /**
     * TODO:拓展点2。
     * @param code
     */
    public void getComputer(int code) {
        // 根据code获取对应的Computer服务。
        if (code == 1) {
            list.get(1).getComputer();
            return;
        }
        list.get(0).getComputer();
    }

}