package com.liu.study.design.model.behavior.other.tradition.impl;

import com.liu.study.design.model.behavior.other.tradition.PlayerService;

/**
 * 只能播放Wmv格式的播放器
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/25 9:25
 */
public class WmvPlayerServiceImpl implements PlayerService {

    @Override
    public void play(String file) {
        System.out.println("This is WMV 播放器");
    }
}