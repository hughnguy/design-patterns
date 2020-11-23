package com.behavioral.mediator;

import java.util.*;

public class ChatRoom {

    public static Map<String, User> users = new HashMap<>();

    public static void addUser(User user) {
        users.putIfAbsent(user.getName(), user);
    }

    public static void showMessage(User user, String message){
        Iterator<User> it = users.values().iterator();
        while(it.hasNext()) {
            User currentUser = it.next();
            if(!user.getName().equals(currentUser.getName())) {
                currentUser.receiveMessage(message);
            }
        }
    }
}
