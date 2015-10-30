package com.topicos.topicosandroid.dao;

import com.topicos.topicosandroid.api.API;
import com.topicos.topicosandroid.domain.Subject;
import com.topicos.topicosandroid.domain.Task;
import com.topicos.topicosandroid.domain.User;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by maychellfernandesdeoliveira on 05/10/2015.
 */
public class Dao {

    public Dao() {}

    public List<Task> getTasks(User user) {
        API api = new API();
        List<Task> tasks = new ArrayList<>();

        try {
//            tasks = api.getTasks(user.getIdUser());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tasks;
    }

    public List<Subject> getSubjects(User user) {
        API api = new API();
        return api.getSubjects();
    }
}
