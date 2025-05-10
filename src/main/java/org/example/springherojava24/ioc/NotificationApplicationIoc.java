package org.example.springherojava24.ioc;

import org.example.springherojava24.nonioc.EmailService;
import org.example.springherojava24.nonioc.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NotificationApplicationIoc {
    private EmailService emailService;


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        NotificationApplicationIoc application = new NotificationApplicationIoc();
        MessageService messageService = context.getBean(MessageService.class);
        if (messageService != null) {
            messageService.sendMessage("spring ioc manaing this", "shayan@gmail.com");
        } else System.out.println("messageService is null");
        MessageService messageService2 = context.getBean(MessageService.class);
        System.out.println("Is myMessageService the same as anotherInstance? " + (messageService == messageService2));
        ((AnnotationConfigApplicationContext) context).close();


    }
}
