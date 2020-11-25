package com.patterns.behavioral.state;

import com.patterns.behavioral.state.states.OrderedState;
import com.patterns.behavioral.state.states.PackageState;

public class Package {
    private PackageState state = new OrderedState();

    // getter, setter
    public void setState(PackageState state) {
        this.state = state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
