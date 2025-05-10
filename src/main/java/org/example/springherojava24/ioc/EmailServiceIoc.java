package org.example.springherojava24.ioc;

import org.example.springherojava24.nonioc.MessageService;
import org.springframework.stereotype.Service;

@Service("emailServiceBean")
//@Component the same
public class EmailServiceIoc implements MessageService {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Email sent to " + recipient+"with message " + message);
    }
}
