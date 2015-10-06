package com.topicos.topicosandroid.domain;

import java.util.List;

/**
 * Created by maychellfernandesdeoliveira on 05/10/2015.
 */
public class User {

    private int idUser;
    private String regNumber;
    private String name;
    private List<Subject> taskSubject;

    public User() {}

    public User(int idUser, String regNumber, String name){
        this.idUser = idUser;
        this.regNumber = regNumber;
        this.name = name;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
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
