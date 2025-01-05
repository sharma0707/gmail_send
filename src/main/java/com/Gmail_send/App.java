package com.Gmail_send;

import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String message = "";
        String subject = "";
        String to = "";
        String from = "";
        
        sendEmail(message, subject, to, from);
     }

	private static void sendEmail(String message, String subject, String to, String from) {
		
	//variable for gmail
		String host= "smtp.gmail.com";
		
	//get the system properties
	Properties properties =	System.getProperties();
	System.out.println(properties);
	
	//host set
	properties.put("mail.smtp.host", host);
	properties.put("mail.smtp.port", "465");
	properties.put("mail.smtp.ssl.enable", "true");
	properties.put("mail.smtp.auth", "true");
	
	
	//create sesion
	
		
	}
}
