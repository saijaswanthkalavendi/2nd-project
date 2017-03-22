package com.niit.chatusbackend.controller;

import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.niit.chatusbackend.model.Message;
import com.niit.chatusbackend.model.OutputMessage;
@Controller
public class ChatController {

	@MessageMapping("/chat")
	@SendTo("/topic/message")
	public OutputMessage sendMessage(Message message){
		return new OutputMessage(message,new Date());
	}
	}