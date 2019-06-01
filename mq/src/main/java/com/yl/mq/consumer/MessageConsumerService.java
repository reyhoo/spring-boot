package com.yl.mq.consumer;


import com.yl.mq.Const;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MessageConsumerService {


//    @JmsListener(destination = Const.MQ_QUEUE_DEST)
    public void receiveMessage(String msgText){
        log.info("msgText={}",msgText);
    }
}
