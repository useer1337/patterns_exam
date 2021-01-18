package com.company.structural.decorator;

public class Notifier implements Component{
    @Override
    public void send(String message) {
        System.out.println("Отправка по почте сообщения : " + message);
    }
}
