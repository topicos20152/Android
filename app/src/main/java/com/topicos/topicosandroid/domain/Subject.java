package com.topicos.topicosandroid.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maychellfernandesdeoliveira on 05/10/2015.
 */
public class Subject extends Entity {

    private String codeSubject;
    private String name;

    public Subject() {
    }

    public Subject(String idSubject, String codeSubject, String name) {
        this.setId(idSubject);
        this.codeSubject = codeSubject;
        this.name = name;
    }

    public static List<String> keys() {
        List<String> keys = new ArrayList<String>();

        keys.add(Subject.ID);
        keys.add(Subject.NAME);

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

    @Override
    public String toString() {
        return codeSubject + " " + name;
    }

    public static final String ID = "_id";
    public static final String NAME = "title";
}
