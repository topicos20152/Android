package com.topicos.topicosandroid.dao;

import com.topicos.topicosandroid.api.ApiRequest;
import com.topicos.topicosandroid.domain.Subject;
import com.topicos.topicosandroid.domain.Task;
import com.topicos.topicosandroid.domain.User;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Created by batman on 30/10/15.
 */
public class TaskDao {

    public TaskDao() {}

    public List<Task> getTasks(User user) {

        List<Task> tasks = new ArrayList<Task>();

        try {
            for (Map<String, String> taskMap : new ApiRequest("tasks", "GET", Task.keys()).execute().get()) {
                Task task = new Task();

                task.setId(taskMap.get("id"));
                task.setName(taskMap.get("title"));

                //Formatting date
                SimpleDateFormat inFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                task.setDateEnd(inFormat.parse(taskMap.get("delivery_date")));

                task.setSubject(new Subject());
                task.getSubject().setName("course_title");

                tasks.add(task);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tasks;
    }

    public Task getSingleTask(String id) {
        Task task = new Task();
        try {
            for (Map<String, String> taskMap : new ApiRequest("tasks/"+id, "GET", Task.keys()).execute().get()) {

                task.setId(taskMap.get("id"));
                task.setName(taskMap.get("title"));
                task.setSubject(new Subject());
                task.getSubject().setName("course_title");
                task.setStatus(taskMap.get("status"));

                //Formatting date
                SimpleDateFormat inFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                task.setDateEnd(inFormat.parse(taskMap.get("delivery_date")));

                task.setDescription(taskMap.get("description"));

                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return task;
    }
}
