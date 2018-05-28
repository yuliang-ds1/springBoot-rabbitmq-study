package com.alachao.study.rabbitmq;


import com.alachao.study.rabbitmq.common.DetailRes;
import com.alachao.study.rabbitmq.common.MessageWithTime;

/**
 * Created by littlersmall on 16/5/12.
 */
public interface MessageSender {
    DetailRes send(Object message);

    DetailRes send(MessageWithTime messageWithTime);
}
