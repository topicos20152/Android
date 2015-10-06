package com.topicos.topicosandroid.domain;

/**
 * Created by maychellfernandesdeoliveira on 05/10/2015.
 */
public class Subject {

    private int idSubject;
    private String codeSubject;
    private String name;
    private int credits;

    public Subject() {
    }

    public Subject(int idSubject, String codeSubject, String name, int credits) {
        this.idSubject = idSubject;
        this.codeSubject = codeSubject;
        this.name = name;
        this.credits = credits;
    }

    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    public String getCodeSubject() {
        return codeSubject;
    }

    public void setCodeSubject(String codeSubject) {
        this.codeSubject = codeSubject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

}
