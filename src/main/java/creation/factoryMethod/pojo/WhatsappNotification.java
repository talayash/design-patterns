package creation.factoryMethod.pojo;

public class WhatsappNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Whatsapp Notification!");
    }
}
