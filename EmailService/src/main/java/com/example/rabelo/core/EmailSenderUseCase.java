package com.example.rabelo.core;

public interface EmailSenderUseCase {

	void sendEmail(String to, String subject, String body);
}
