package com.company.structural.decorator;

public class TwitterDecorator extends BaseDecorator {

    public TwitterDecorator(Component component) {
        super(component);
    }

    public void sendMessageToTwitter(String message) {
        System.out.println("Отправилось сообщение в Твитор: " + message);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendMessageToTwitter(message);
    }


}
