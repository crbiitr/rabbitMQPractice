package com.practice.rabbitmq;

import com.practice.rabbitmq.model.SimpleMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqApplication implements CommandLineRunner{
	@Autowired
	private RabbitTemplate rabbitTemplate;
	public static void main(String[] args) {
		SpringApplication.run(RabbitmqApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
//		rabbitTemplate.convertAndSend("Hello from Chetan");
		SimpleMessage message = new SimpleMessage("test","Just a test message");
		//rabbitTemplate.convertAndSend("TestExchange","testRouting","Hi from my side");
		rabbitTemplate.convertAndSend("TestExchange","testRouting",message);
	}
}
