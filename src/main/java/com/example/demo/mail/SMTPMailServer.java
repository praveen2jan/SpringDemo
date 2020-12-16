package com.example.demo.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class SMTPMailServer implements MailSender{

    private static Log log = LogFactory.getLog(SMTPMailServer.class);
    @Override
    public void send(String to, String subject, String body) {
        log.info("Sending SMTP mail "+ to);
        log.info("Sending SMTP mail "+ subject);
        log.info("Sending SMTP mail "+ body);
    }
}
