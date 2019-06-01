package com.yl.mq.config;


import com.yl.mq.producer.IMessageProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class ScheduleConfig {

    @Autowired
    private IMessageProducerService messageProducerService;


    @Scheduled(initialDelay = 5000,fixedDelay = 3000)
    public void send(){
        messageProducerService.sendMessage("currTime:"+System.currentTimeMillis());
    }
}
