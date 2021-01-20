package com.company.behavioral.observer;

/**
 * @author koval
 */
public class Client {

    public static void main(String[] args) {

        TwitterSubscriber twitterSubscriber = new TwitterSubscriber();
        TelegramSubscriber telegramSubscriber = new TelegramSubscriber();

        Account account = new Account();
        account.subscribe(twitterSubscriber);
        account.subscribe(telegramSubscriber);

        account.changeContent("telegram is good!!");

    }

}
