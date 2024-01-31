package structural.decorator.example1;

import structural.decorator.example1.decorator.MessageImpl;
import structural.decorator.example1.interfaces.Message;
import structural.decorator.example1.messages.MailMessage;
import structural.decorator.example1.messages.SmsMessage;
import structural.decorator.example1.messages.WhatsappMessage;

public class Main {

    public static void main(String[] args) {


        Message message1 = new MailMessage(new MessageImpl());
        Message message2 = new SmsMessage(new MessageImpl());
        Message message3 = new WhatsappMessage(new MessageImpl());

        System.out.println(message1.printMessage());
        System.out.println(message2.printMessage());
        System.out.println(message3.printMessage());
    }
}
