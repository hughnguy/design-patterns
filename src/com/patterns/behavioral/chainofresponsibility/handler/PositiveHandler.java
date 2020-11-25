package com.patterns.behavioral.chainofresponsibility.handler;

import com.patterns.behavioral.chainofresponsibility.Number;

public class PositiveHandler extends Handler {
    public PositiveHandler(Handler handler){
        super(handler);
    }

    @Override
    public void handleRequest(Number request) {
        if (request.getNumber() > 0) {
            System.out.println("PositiveHandler : " + request.getNumber());
        } else {
            super.handleRequest(request);
        }
    }
}
