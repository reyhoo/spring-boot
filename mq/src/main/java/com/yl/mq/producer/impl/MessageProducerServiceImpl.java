package com.yl.mq.producer.impl;

import com.yl.mq.producer.IMessageProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.jms.Queue;
import javax.jms.Topic;

@Service
@Slf4j
public class MessageProducerServiceImpl implements IMessageProducerService {

    @Autowired
    private Queue queue;
@Autowired
    private Topic topic;
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Override
//    @Async
    public void sendMessage(String msg) {
        try {
            Thread.sleep(1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jmsMessagingTemplate.convertAndSend(queue,msg);
        log.info("send:msg={}",msg);

    }

    @Override
    public void sendTopicMessage(String msg) {
        try {
            Thread.sleep(1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jmsMessagingTemplate.convertAndSend(topic,msg);
        log.info("send:msg={}",msg);
    }
}
