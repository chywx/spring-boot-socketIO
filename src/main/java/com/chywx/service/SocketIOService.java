package com.chywx.service;

import com.chywx.entity.PushMessage;

/**
 * 功能描述
 *
 * @author chy
 * @date 2019/7/16 0016
 */
public interface SocketIOService {
    /*
    自定义事件
     */
    public static final String BET_PING = "bet_ping";

    public static final String BET_PONG = "bet_pong";

    public static final String PUSH_MESSAGE = "push_message";



    // 启动服务
    void start() throws Exception;

    // 停止服务
    void stop();

    // 推送信息
    void pushMessageToUser(PushMessage pushMessage);
}
