package com.company.behavioral.observer;

/**
 * @author koval
 */
public class TelegramSubscriber implements Subscriber{
    @Override
    public void update(String content) {
        if (content.contains("telegram")) {
            System.out.println("В этом посте упомянули telegram: " + content + ".");
        }
    }
}
