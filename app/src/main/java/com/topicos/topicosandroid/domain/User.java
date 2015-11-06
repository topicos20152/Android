package com.topicos.topicosandroid.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maychellfernandesdeoliveira on 05/10/2015.
 */
public class User extends Entity {

    public static final String CLASS_NAME = "user";
    private String regNumber;
    private String name;
    private String userName;

    public User() {}

    public User(String idUser, String regNumber, String name, String userName) {
        this.setId(idUser);
        this.regNumber = regNumber;
        this.name = name;
        this.userName = userName;
    }

    public static List<String> keys() {
        List<String> keys = new ArrayList<String>();

        keys.add(User.ID);
        keys.add(User.NAME);
        keys.add(User.REG_NUMBER);
        keys.add(User.USER_NAME);

        return keys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public static final String ID = "_id";
    public static final String NAME = "name";
    public static final String REG_NUMBER = "sigaa_uuid";
    public static final String USER_NAME = "username";
}
