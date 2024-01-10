package com.example.rabelo.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rabelo.adapters.EmailSenderGateway;
import com.example.rabelo.core.EmailSenderUseCase;

@Service
public class EmailSenderService implements EmailSenderUseCase{

	private final EmailSenderGateway emailSenderGateway;
	
	@Autowired
    public EmailSenderService(EmailSenderGateway emailGateway) {
		this.emailSenderGateway = emailGateway;
	}
	@Override
	public void sendEmail(String to, String subject, String body) {
	this.emailSenderGateway.sendEmail(to, subject, body);
		
	}
	

}
