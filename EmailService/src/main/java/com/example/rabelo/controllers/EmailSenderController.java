package com.example.rabelo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rabelo.application.EmailSenderService;

@RestController
@RequestMapping("/api/email")
public class EmailSenderController {

	private final EmailSenderService emailSenderService;
	
	@Autowired
	public EmailSenderController(EmailSenderService emailService) {
		this.emailSenderService = emailService;
	}
}
