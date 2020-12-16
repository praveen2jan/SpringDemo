package com.example.demo.mail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MailConfig {


    public MailSender mockMailSender(){
        return new MockMailSender();

    }


    public MailSender smtpMailSender(){
        return  new SMTPMailServer();
    }
}
