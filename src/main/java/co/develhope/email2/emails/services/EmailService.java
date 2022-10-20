package co.develhope.email2.emails.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendTo(String email, String title, String text) throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");
        String htmlMsg = "<h1>Hello World!</h1>" +
                "<h2>You have a new message: </h2>" +
                "<img src='https://is.wikipedia.org/wiki/Snorri_Sturluson#/media/Mynd:Snorri_sturluson_1930.jpg' alt='Alternative text' height='200'>" +
                "<h3>" + text + "</h3>";
        helper.setText(htmlMsg, true);
        helper.setTo(email);
        helper.setSubject(title);
        helper.setFrom("develhope@develhope.co");
        javaMailSender.send(mimeMessage);
    }
}
