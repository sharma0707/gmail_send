package com.content;

import java.util.Properties;

import javax.mail.Session;
import javax.mail.Transport;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.Message.RecipientType;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class Content {

	public boolean sendEmail(String to, String from, String subject, String text) {
		
		boolean flag = false;
		
		Properties properties =  new Properties();
		properties.put("mail.smtp.auth", true);
		properties.put("mail.smtp.starttls.enable", true);
		properties.put("mail.smtp.port", 587);
		properties.put("mail.smtp.host", "smtp.gmail.com");
		
		
		
	jakarta.mail.Session session = jakarta.mail.Session.getInstance(properties, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				String user = "tulsi21sharma";
				String pass= "qwzp cueq jusa azfz";
				return new PasswordAuthentication(user, pass);
				
			}	
		});
	
		try {
			Message msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(from));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			msg.setSubject(subject);
			msg.setText(text);
			
			//send message by transport
			jakarta.mail.Transport.send(msg);
			flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();		}
		
		return flag;
		
	}
}
