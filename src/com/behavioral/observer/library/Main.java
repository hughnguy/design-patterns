package com.behavioral.observer.library;

/**
 * Note: Observer interface isn't perfect and is deprecated since Java 9.
 * One of its cons is that Observable isn't an interface but a class, that's why subclasses can't be used as observables.
 *
 * Also, a developer could override some of the Observable‘s synchronized methods and disrupt their thread-safety.
 *
 * PropertyChangeListener interface is recommended instead of using Observer.
 */
public class Main {
    public static void main(String[] args) {
        ONewsAgency observable = new ONewsAgency();
        ONewsChannel observer = new ONewsChannel();
        ONewsChannel observer2 = new ONewsChannel();

        observable.addObserver(observer);
        observable.addObserver(observer2);

        observable.setNews("news");
    }
}
