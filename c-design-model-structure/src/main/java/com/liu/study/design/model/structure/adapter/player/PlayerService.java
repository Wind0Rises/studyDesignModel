package com.liu.study.design.model.structure.adapter.player;

/**
 * 业务接口，播放接口。
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/25 9:20
 */
public interface PlayerService {

    /**
     * 播放操作，根据文件类型进行播放。
     *
     * @param file
     */
    void play(String file);

}