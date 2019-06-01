package com.yl.mq.producer.impl;

import com.yl.mq.producer.IMessageProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Queue;

@Service
@Slf4j
public class MessageProducerServiceImpl implements IMessageProducerService {

    @Autowired
    private Queue queue;

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Override
    public void sendMessage(String msg) {

        jmsMessagingTemplate.convertAndSend(queue,msg);
        log.info("send:msg={}"+msg);

    }
}
