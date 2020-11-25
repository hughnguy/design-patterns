package com.patterns.behavioral.observer;

/**
 * Observer is a behavioral design pattern that lets you define a subscription mechanism to notify
 * multiple objects about any events that happen to the object they’re observing.
 *
 * An observable is an object which notifies observers about the changes in its state.
 *
 * Observable (NewsAgency): object which notifies observers about the changes in its state
 * Observer (NewsChannel): gets notified of updates
 */
public class Main {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();

        NewsChannel observer1 = new NewsChannel();
        NewsChannel observer2 = new NewsChannel();

        observable.addObserver(observer1);
        observable.addObserver(observer2);

        observable.setNews("news");

        System.out.println(observer1.getNews());
        System.out.println(observer2.getNews());

        observable.setNews("news2");

        System.out.println(observer1.getNews());
        System.out.println(observer2.getNews());
    }
}
