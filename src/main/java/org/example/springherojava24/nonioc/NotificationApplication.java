package org.example.springherojava24.nonioc;

public class NotificationApplication {
    private EmailService emailService;

    public NotificationApplication() {
        this.emailService = new EmailService(); // Direct instantiation - NotificationApplication controls EmailService creation
    }

    public void sendNotification(String message, String recipient) {
        this.emailService.sendMessage(message, recipient);
    }

    public static void main(String[] args) {
        NotificationApplication application = new NotificationApplication();
        application.sendNotification("Hello World", "shayan@gmail.com");

    }
}
