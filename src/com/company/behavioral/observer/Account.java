package com.company.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author koval
 */
public class Account {

    private String content;
    private List<Subscriber> subscribers;

    public Account() {
        subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void changeContent(String newContent){
        content = newContent;
        notifySubs();
    }

    private void notifySubs(){
        subscribers.forEach(s -> s.update(content));
    }

}
