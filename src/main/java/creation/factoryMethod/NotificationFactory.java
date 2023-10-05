package creation.factoryMethod;

import creation.factoryMethod.pojo.EmailNotification;
import creation.factoryMethod.pojo.Notification;
import creation.factoryMethod.pojo.SMSNotification;
import creation.factoryMethod.pojo.WhatsappNotification;

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
