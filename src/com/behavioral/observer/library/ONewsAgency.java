package com.behavioral.observer.library;

import java.util.Observable;

public class ONewsAgency extends Observable {
    private String news;

    public void setNews(String news) {
        /**
         * Note that we don't need to call the observer's update() method directly.
         * We just call setChanged() and notifyObservers(), and the Observable class is doing the rest for us.
         */
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
}
