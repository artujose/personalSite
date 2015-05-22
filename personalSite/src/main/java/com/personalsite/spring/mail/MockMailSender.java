package com.personalsite.spring.mail;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

//@Component("mockMailSenderObject")
public class MockMailSender implements MailSender {

	private static final Logger logger = LoggerFactory.getLogger(MockMailSender.class);
	
	/* (non-Javadoc)
	 * @see com.personalsite.spring.mail.MailSender#send(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void send(String to, String subject, String body){
		logger.info("Sending mail t:o "+ to);
		logger.info("Subject: "+subject);
		logger.info("Body: "+body);
	}
	
}