package com.patterns.behavioral.mediator;

public class Runway implements Command
{
    private ATCMediator atcMediator;

    public Runway(ATCMediator atcMediator) {
        this.atcMediator = atcMediator;
        atcMediator.setLandingStatus(true);
    }

    @Override
    public void land() {
        System.out.println("Landing permission granted.");
        atcMediator.setLandingStatus(true);
    }
}
