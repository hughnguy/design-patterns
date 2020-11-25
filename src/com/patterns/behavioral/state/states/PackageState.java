package com.patterns.behavioral.state.states;

import com.patterns.behavioral.state.Package;

public interface PackageState {
    void next(Package pkg);
    void prev(Package pkg);
    void printStatus();
}
