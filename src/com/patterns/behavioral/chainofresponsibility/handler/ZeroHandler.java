package com.patterns.behavioral.chainofresponsibility.handler;

import com.patterns.behavioral.chainofresponsibility.Number;

public class ZeroHandler extends Handler {
    public ZeroHandler(Handler handler){
        super(handler);
    }

    @Override
    public void handleRequest(Number request) {
        if (request.getNumber() == 0) {
            System.out.println("ZeroHandler : " + request.getNumber());
        } else {
            super.handleRequest(request);
        }
    }
}
