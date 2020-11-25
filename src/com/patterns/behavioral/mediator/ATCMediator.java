package com.patterns.behavioral.mediator;

public class ATCMediator {
    private Flight flight;
    private Runway runway;
    public boolean land = false;

    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    public boolean isLandingOk() {
        return land;
    }

    public void setLandingStatus(boolean status){
        land = status;
    }
}
