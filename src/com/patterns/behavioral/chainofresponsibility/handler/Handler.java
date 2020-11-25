package com.patterns.behavioral.chainofresponsibility.handler;

import com.patterns.behavioral.chainofresponsibility.Number;

public abstract class Handler {
    private Handler handler;

    public Handler(Handler handler){
        this.handler = handler;
    };

    public void handleRequest(Number request){
        if(handler != null)
            handler.handleRequest(request);
    };
}
