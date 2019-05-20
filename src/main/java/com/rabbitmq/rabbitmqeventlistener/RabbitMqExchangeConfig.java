package com.rabbitmq.rabbitmqeventlistener;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqExchangeConfig {

    @Bean
    Exchange exampleExchange() {
        return new TopicExchange("ExampleExchange");
    }

    @Bean
    Exchange example2ndExchange() {
        return ExchangeBuilder.directExchange("DirectTestExchange")
                .autoDelete()
                .internal()
                .build();
    }

    @Bean
    Exchange newExchange() {
        return ExchangeBuilder.topicExchange("TopicTestExchange")
                .autoDelete()
                .durable(true)
                .internal()
                .build();
    }

    @Bean
    Exchange fanoutExchange() {
        return ExchangeBuilder.fanoutExchange("FanoutTestExchange")
                .internal()
                .durable(false)
                .autoDelete()
                .build();
    }

    @Bean
    Exchange headersExchange() {
        return ExchangeBuilder.headersExchange("HeadersTestExchange")
                .durable(true)
                .internal()
                .autoDelete()
                .build();
    }
}
