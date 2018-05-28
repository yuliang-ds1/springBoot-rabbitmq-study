package com.alachao.study.rabbitmq;


import com.alachao.study.rabbitmq.common.DetailRes;

/**
 * Created by littlersmall on 16/5/11.
 */
public interface MessageProcess<T> {
    DetailRes process(T message);
}
