package com.behavioral.chainofresponsibility.handler;

import com.behavioral.chainofresponsibility.Number;

public class NegativeHandler extends Handler {
    public NegativeHandler(Handler handler){
        super(handler);

    }

    @Override
    public void handleRequest(Number request) {
        if (request.getNumber() < 0) {
            System.out.println("NegativeHandler : " + request.getNumber());
        } else {
            super.handleRequest(request);
        }
    }
}
