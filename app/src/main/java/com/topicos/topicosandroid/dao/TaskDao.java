package com.topicos.topicosandroid.dao;

import com.topicos.topicosandroid.api.ApiRequest;
import com.topicos.topicosandroid.domain.Subject;
import com.topicos.topicosandroid.domain.Task;
import com.topicos.topicosandroid.domain.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by batman on 30/10/15.
 */
public class TaskDao {

    public TaskDao() {}

    public List<Task> getTasks(User user) {

        List<Task> tasks = new ArrayList<Task>();

        try {
            for (Map<String, String> taskMap : (List<Map<String, String>>) new ApiRequest("tasks", "GET", Task.keys()).execute()) {
                Task task = new Task();

                task.setIdTask(taskMap.get("id"));
                task.setName(taskMap.get("title"));
                task.setDateEnd(new Date(taskMap.get("delivery_date")));
                task.setSubject(new Subject());
                task.getSubject().setName("course_title");

                tasks.add(task);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tasks;
    }

}
