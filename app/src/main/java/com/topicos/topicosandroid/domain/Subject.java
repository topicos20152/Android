package com.topicos.topicosandroid.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maychellfernandesdeoliveira on 05/10/2015.
 */
public class Subject extends Entity {

    private String codeSubject;
    private String name;
    private int credits;

    public Subject() {
    }

    public Subject(String idSubject, String codeSubject, String name, int credits) {
        this.setId(idSubject);
        this.codeSubject = codeSubject;
        this.name = name;
        this.credits = credits;
    }

    public static List<String> keys() {
        List<String> keys = new ArrayList<String>();

        keys.add("id");
        keys.add("code_subject");
        keys.add("name");
        keys.add("credits");

        return keys;
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

    @Override
    public String toString() {
        return codeSubject + " " + name;
    }
}
