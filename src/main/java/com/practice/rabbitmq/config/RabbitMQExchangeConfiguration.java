package com.practice.rabbitmq.config;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chetan on 25/4/20.
 */
@Configuration
public class RabbitMQExchangeConfiguration {

    @Bean
    Exchange exampleExchange() {
        return new TopicExchange("ExampleExchange");
    }

    @Bean
    Exchange example2ndExchange() {
        return ExchangeBuilder.directExchange("Example2ndExchange")
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
                .autoDelete()
                .durable(false)
                .internal()
                .build();
    }
    @Bean
    Exchange headerExchange() {
        return ExchangeBuilder.fanoutExchange("HeaderTestExchange")
                .autoDelete()
                .durable(true)
                .internal()
                .build();
    }

}
