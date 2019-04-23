package com.messaging.springactivemq.listner;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.messaging.springactivemq.model.Employee;

@Component
public class MessageListener {
	
	@JmsListener(destination="localQueue")
	public void messageProcessor(Employee message){ 
		System.out.println("Message Received: \n "+message);	
	}

}
