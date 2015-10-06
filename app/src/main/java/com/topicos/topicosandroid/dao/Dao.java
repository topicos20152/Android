package com.topicos.topicosandroid.dao;

import com.topicos.topicosandroid.api.API;
import com.topicos.topicosandroid.domain.Task;
import com.topicos.topicosandroid.domain.User;

import java.util.List;

/**
 * Created by maychellfernandesdeoliveira on 05/10/2015.
 */
public class Dao {

    public Dao() {}

    public List<Task> getTasks(User user) {
        API api = new API();

        return api.getTasks(user.getIdUser());
    }
}
