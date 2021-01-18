package com.company.structural.decorator;

public class SMSDecorator extends BaseDecorator {
    public SMSDecorator(Component component) {
        super(component);
    }

    public void sendToSMS(String message){
        System.out.println("Отправленно по СМС: " + message);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendToSMS(message);
    }


}
