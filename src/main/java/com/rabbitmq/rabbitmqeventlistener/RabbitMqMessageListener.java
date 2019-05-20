package com.rabbitmq.rabbitmqeventlistener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class RabbitMqMessageListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        System.out.print("message = [" + new String(message.getBody()) + "]");
    }
}
