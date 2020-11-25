package com.patterns.behavioral.state.states;

import com.patterns.behavioral.state.Package;

public class ReceivedState implements PackageState {
    @Override
    public void next(Package pkg) {
        System.out.println("This package is already received by a client.");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package received :)");
    }
}
