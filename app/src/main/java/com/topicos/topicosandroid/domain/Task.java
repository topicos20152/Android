package com.topicos.topicosandroid.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by maychellfernandesdeoliveira on 05/10/2015.
 */
public class Task {

    private String idTask;
    private String name;
    private String description;
    private Date dateStart;
    private Date dateEnd;
    private Subject subject;
    private String status;

    public Task() {}

    public Task(String idTask, String name, String description, Date dateStart, Date dateEnd, Subject subject, String status) {
        this.idTask = idTask;
        this.name = name;
        this.description = description;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.subject = subject;
        this.status = status;
    }

    public static List<String> keys(){
        List<String> keys = new ArrayList<String>();

        keys.add("id");
        keys.add("course_title");
        keys.add("delivery_date");
        keys.add("title");

        return keys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getIdTask() {
        return idTask;
    }

    public void setIdTask(String idTask) {
        this.idTask = idTask;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }
}
