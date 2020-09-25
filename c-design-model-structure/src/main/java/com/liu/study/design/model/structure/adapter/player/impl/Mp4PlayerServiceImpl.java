package com.liu.study.design.model.structure.adapter.player.impl;

import com.liu.study.design.model.structure.adapter.player.PlayerService;

/**
 * 只能播放Mp4格式的播放器
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/25 9:22
 */
public class Mp4PlayerServiceImpl implements PlayerService {

    @Override
    public void play(String file) {
        System.out.println("This is Mp4 播放器...");
    }

}