package com.practice.rabbitmq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * Created by chetan on 24/4/20.
 */
public class RabbitMQMessageListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        System.out.println("Message : [" + new String(message.getBody()) + "]");
    }


}
