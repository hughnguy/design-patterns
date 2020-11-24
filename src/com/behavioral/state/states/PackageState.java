package com.behavioral.state.states;

import com.behavioral.state.Package;

public interface PackageState {
    void next(Package pkg);
    void prev(Package pkg);
    void printStatus();
}
