package com.Gmail_send;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.content.Content;


public class App {
	public static void main(String[] args) {
		System.out.println("Trying to send the message...");
		String text = "Hello Dear, This is the first message to you";
		String subject = "Message testing";
		String from = "tulsi21sharma@gmail.com";
		String to = "rpsharma7799@gmail.com";
		
		Content gmailContent = new Content();
		boolean b = gmailContent.sendEmail(to, from, subject, text);
		
		if(b) {
			System.out.println("sent successfully....");
		}
		else {
			System.out.println("something went wrong");
		}
		
	}

		}
