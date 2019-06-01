package com.yl.mq.config;

import com.yl.mq.Const;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTempTopic;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;
import javax.jms.Topic;

@Configuration
@EnableJms
public class JmsConfig {

    @Bean
    public Queue queue(){
        return new ActiveMQQueue(Const.MQ_QUEUE_DEST);
    }
@Bean
    public Topic topic(){
        return new ActiveMQTopic(Const.MQ_TOPIC_DEST);
    }

}
