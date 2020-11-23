package com.behavioral.mediator;

public class User {
    private String name;

    public User(String name){
        this.name  = name;
        ChatRoom.addUser(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this, message);
    }

    public void receiveMessage(String message){
        System.out.println(getName() + " received message: " + message);
    }
}
