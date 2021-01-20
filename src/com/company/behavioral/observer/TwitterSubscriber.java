package com.company.behavioral.observer;

/**
 * @author koval
 */
public class TwitterSubscriber implements Subscriber {
    @Override
    public void update(String content) {
        if (content.contains("twitter")) {
            System.out.println("В этом посте упомянули twitter: " + content + ".");
        }
    }
}
