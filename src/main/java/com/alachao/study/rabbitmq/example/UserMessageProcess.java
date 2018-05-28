package com.alachao.study.rabbitmq.example;

import com.alachao.study.rabbitmq.MessageProcess;
import com.alachao.study.rabbitmq.common.DetailRes;

/**
 * Created by littlersmall on 16/6/28.
 */
public class UserMessageProcess implements MessageProcess<UserMessage> {
    @Override
    public DetailRes process(UserMessage userMessage) {
        System.out.println(userMessage);

        return new DetailRes(true, "");
    }
}
