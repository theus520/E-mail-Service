package com.example.rabelo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rabelo.application.EmailSenderService;
import com.example.rabelo.core.EmailRequest;
import com.example.rabelo.core.exceptions.EmailServiceException;

@RestController
@RequestMapping("/api/email")
public class EmailSenderController {

	private final EmailSenderService emailSenderService;
	
	@Autowired
	public EmailSenderController(EmailSenderService emailService) {
		this.emailSenderService = emailService;
	}
	
 @PostMapping()
 public ResponseEntity<String> sendEmail(@RequestBody EmailRequest request) {
	 try {
		this.emailSenderService.sendEmail(request.to(), request.subject(), request.body());
		return ResponseEntity.ok("email send sucessfully");
	} catch (EmailServiceException exc) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error whilw sending email");
		
	}
	 
 }
}
