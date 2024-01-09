package com.example.rabelo.adapters;

public interface EmailSenderGateway {

	void sendEmail(String to,String subject, String body);
}
