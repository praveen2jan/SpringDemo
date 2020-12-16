package com.example.demo.controller;

import com.example.demo.mail.MailSender;
import com.example.demo.mail.MockMailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {


    public MailController(MailSender mockMailSender) {
        this.mailSender = mailSender;
    }

    private MailSender mailSender;

    @RequestMapping("/mail")
    public String mail(){
        mailSender.send("test","test","body");
        return "Mail Sent ";
    }
}
