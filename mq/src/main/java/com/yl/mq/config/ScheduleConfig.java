package com.yl.mq.config;


import com.yl.mq.producer.IMessageProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
@Slf4j
@EnableAsync
public class ScheduleConfig {

    @Autowired
    private IMessageProducerService messageProducerService;


    @Scheduled(initialDelay = 5000,fixedDelay = 3000)
    public void send(){
        log.info("send start");
        messageProducerService.sendTopicMessage("currTime:"+System.currentTimeMillis());
        log.info("send end");
    }
}
