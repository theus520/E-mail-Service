package com.example.rabelo.application;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.rabelo.core.EmailSenderUseCase;

public class EmailSenderService implements EmailSenderUseCase{

	private final EmailSenderGateway EmailSenderGateway;
	
	@Autowired
    public EmailSenderService(EmailSenderService emailGateway) {
		this.EmailSenderGateway = emailGateway;
	}
	
	@Override
	public void sendEmail(String to, String subject, String body) {
		
		
	}

}
