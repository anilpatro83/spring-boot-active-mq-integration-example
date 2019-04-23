package com.messaging.springactivemq.config;

import javax.jms.Queue;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

@Configuration
@EnableJms
public class MessagingConfig {
	
	@Value("${spring.activemq.broker-url}")
	private String url;
	
	@Bean
	public Queue queue(){
		return new ActiveMQQueue("localQueue");
	}

	@Bean
	public ActiveMQConnectionFactory activeMQConnectionFactory(){
		ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(url);
		factory.setTrustAllPackages(true);
		return factory;
	}
	
	@Bean
	public JmsTemplate jmsTemplate(ActiveMQConnectionFactory factory){
		return new JmsTemplate(factory);
	}
	
	
}
