package creation.factoryMethod;

import creation.factoryMethod.pojo.Notification;

public class Main {
    public static void main(String[] args) {

        NotificationFactory notificationFactory = new NotificationFactory();

        Notification notification = notificationFactory.createNotification("SMS");

        notification.notifyUser();
    }
}
