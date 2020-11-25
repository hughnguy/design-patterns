package com.patterns.behavioral.mediator;

public class Flight implements Command {
    private ATCMediator atcMediator;

    public Flight(ATCMediator atcMediator) {
        this.atcMediator = atcMediator;
    }

    public void land() {
        if (atcMediator.isLandingOk()) {
            System.out.println("Successfully Landed.");
            atcMediator.setLandingStatus(true);
        } else {
            System.out.println("Waiting for landing.");
        }
    }

    public void getReady() {
        System.out.println("Ready for landing.");
    }
}
