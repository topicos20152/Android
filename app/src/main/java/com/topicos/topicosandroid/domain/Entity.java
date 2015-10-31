package com.topicos.topicosandroid.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maychellfernandesdeoliveira on 31/10/2015.
 */
public class Entity {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static List<String> keys() {
        List<String> keys = new ArrayList<String>();
        keys.add("id");
        return keys;
    }

}
