package com.topicos.topicosandroid.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maychellfernandesdeoliveira on 05/10/2015.
 */
public class User extends Entity {

    private String regNumber;
    private String name;
    private List<Subject> taskSubject;

    public User() {}

    public User(String idUser, String regNumber, String name){
        this.setId(idUser);
        this.regNumber = regNumber;
        this.name = name;
    }

    public static List<String> keys() {
        List<String> keys = new ArrayList<String>();

        keys.add("id");
        keys.add("register_number");
        keys.add("name");
        keys.add("subjects");

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

    public List<Subject> getTaskUser() {
        return taskSubject;
    }

    public void setTaskUser(List<Subject> taskUser) {
        this.taskSubject = taskUser;
    }
}
