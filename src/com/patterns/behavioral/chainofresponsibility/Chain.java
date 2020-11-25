package com.patterns.behavioral.chainofresponsibility;

import com.patterns.behavioral.chainofresponsibility.handler.Handler;
import com.patterns.behavioral.chainofresponsibility.handler.NegativeHandler;
import com.patterns.behavioral.chainofresponsibility.handler.PositiveHandler;
import com.patterns.behavioral.chainofresponsibility.handler.ZeroHandler;

public class Chain {
    Handler chain;

    public Chain(){
        buildChain();
    }

    private void buildChain(){
        chain = new NegativeHandler(new ZeroHandler(new PositiveHandler(null)));
    }

    public void process(Number request) {
        chain.handleRequest(request);
    }
}
