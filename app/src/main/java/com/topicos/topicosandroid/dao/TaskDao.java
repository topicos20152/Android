package com.topicos.topicosandroid.dao;

import com.topicos.topicosandroid.api.ApiRequest;
import com.topicos.topicosandroid.domain.Subject;
import com.topicos.topicosandroid.domain.Task;
import com.topicos.topicosandroid.domain.User;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
//            List<Map<String, String>> allTasks = new ApiRequest(Task.CLASS_NAME, "GET", Task.keys()).execute().get();
//            if(allTasks == null || allTasks.isEmpty())
//                return tasks;
//
//            for (Map<String, String> taskMap : allTasks) {
//                Task task = new Task();
//
//                task.setId(taskMap.get(Task.ID));
//                task.setName(taskMap.get(Task.NAME));
//                task.setSubject(new Subject("5630be8511c8bd0003000002", "DIM0533", taskMap.get(Task.SUBJECT)));
//
//                //Formatting date
//                SimpleDateFormat inFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
//                task.setDateEnd(inFormat.parse(taskMap.get(Task.DATE_END)));
//
//                tasks.add(task);
//            }

                Task task1 = new Task();
                Task task2 = new Task();

                task1.setId("1");
                task1.setName("Tarefa 1");
                task1.setSubject(new Subject("5630be8511c8bd0003000002", "DIM0533", "Teste"));

                //Formatting date
                SimpleDateFormat inFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                task1.setDateEnd(inFormat.parse("2015-10-28T12:24:39.557Z"));

                tasks.add(task1);

                task2.setId("2");
                task2.setName("Tarefa 2");
                task2.setSubject(new Subject("5630be8511c8bd0003000002", "DIM0533", "Teste"));

                //Formatting date
                task2.setDateEnd(inFormat.parse("2015-10-28T12:24:39.557Z"));

                tasks.add(task2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tasks;
    }

    public Task getTask(String id) {
        Task task = null;
        try {
            List<Map<String, String>> allTasks = new ApiRequest(Task.CLASS_NAME+"/"+id, "GET", Task.keys()).execute().get();
            if(allTasks == null || allTasks.isEmpty())
                return task;

            Map<String, String> taskMap = allTasks.get(0);

            task.setId(taskMap.get(Task.ID));
            task.setName(taskMap.get(Task.NAME));
            task.setSubject(new Subject("5630be8511c8bd0003000002", "DIM0533", taskMap.get(Task.SUBJECT)));
            task.setStatus(taskMap.get(Task.STATUS));

            //Formatting date
            SimpleDateFormat inFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            //task.setDateEnd(inFormat.parse(taskMap.get(Task.DATE_START)));
            task.setDateEnd(inFormat.parse(taskMap.get(Task.DATE_END)));

            task.setDescription(taskMap.get(Task.DESCRIPTION));
            task.setAttachment(taskMap.get(Task.ATTACHMENT));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return task;
    }
}
