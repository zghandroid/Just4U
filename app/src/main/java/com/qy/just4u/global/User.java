package com.qy.just4u.global;

/**
 * Created by abc on 2016/11/18.
 */

public class User {

    private String name;

    private User() {

    }

    public static User getUser() {
        return NewInstance.instance;
    }

    private static class NewInstance {
        private static final User instance= new User();
    }
}
