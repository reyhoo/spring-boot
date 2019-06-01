package com.yl.mq.producer;

public interface IMessageProducerService {

    void sendMessage(String msg) ;

    void sendTopicMessage(String msg) ;
}
