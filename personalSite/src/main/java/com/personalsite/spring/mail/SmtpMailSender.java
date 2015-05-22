package com.personalsite.spring.mail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

//@Primary
@Qualifier("smtp")
public class SmtpMailSender implements MailSender {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(SmtpMailSender.class);
	
	private JavaMailSender javaMailSender;
	
	public void setJavaMailSender(JavaMailSender javaMailSender){
		this.javaMailSender = javaMailSender;
	}
	
	@Override
	public void send(String to, String subject, String body) throws MessagingException{
		
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper;
		
		helper = new MimeMessageHelper(message, true);
		
		helper.setSubject(subject);
		helper.setTo(to);
		helper.setText(body, true);
		
		javaMailSender.send(message);
	}
	
}	
	