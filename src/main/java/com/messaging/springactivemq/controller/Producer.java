package com.messaging.springactivemq.controller;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.messaging.springactivemq.model.Employee;

@RestController
@RequestMapping("/producer")
public class Producer {
	
	@Autowired
	private JmsTemplate template;
	@Autowired
	private Queue queue;
	
	
	@RequestMapping(value = "/produce", method = RequestMethod.POST)
	public String produce(@RequestBody Employee message){
		template.convertAndSend(queue, message);
		return "Success";
	}

}