package com.alachao.study.rabbitmq;


import com.alachao.study.rabbitmq.common.DetailRes;

/**
 * Created by littlersmall on 16/5/12.
 */
public interface MessageConsumer {
    DetailRes consume();
}
