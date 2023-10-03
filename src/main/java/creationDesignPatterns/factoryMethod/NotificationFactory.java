package creationDesignPatterns.factoryMethod;

import creationDesignPatterns.factoryMethod.pojo.EmailNotification;
import creationDesignPatterns.factoryMethod.pojo.Notification;
import creationDesignPatterns.factoryMethod.pojo.SMSNotification;
import creationDesignPatterns.factoryMethod.pojo.WhatsappNotification;

public class NotificationFactory {
    public Notification createNotification(String channel) {
        if (channel == null || channel.isEmpty())
            return null;
        return switch (channel) {
            case "SMS" -> new SMSNotification();
            case "EMAIL" -> new EmailNotification();
            case "WHATSAPP" -> new WhatsappNotification();
            default -> throw new IllegalArgumentException("Unknown channel " + channel);
        };
    }
}
