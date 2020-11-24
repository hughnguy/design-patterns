package com.behavioral.observer.library;

import java.util.Observable;
import java.util.Observer;

public class ONewsChannel implements Observer {
    private String news;

    /**
     * notifyObservers() calls this update function
     * for all observers
     */
    @Override
    public void update(Observable o, Object news) {
        System.out.println("Received update: " + news);
        this.setNews((String) news);
    }

    public void setNews(String news) {
        this.news = news;
    }

    public String getNews() {
        return news;
    }
}
