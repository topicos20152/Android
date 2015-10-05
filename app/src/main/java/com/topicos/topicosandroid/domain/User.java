package com.topicos.topicosandroid.domain;

/**
 * Created by maychellfernandesdeoliveira on 05/10/2015.
 */
public class User {

    private int idUser;
    private String regNumber;
    private String name;

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

}
