package com.topicos.topicosandroid.domain;

import java.util.Date;

/**
 * Created by maychellfernandesdeoliveira on 05/10/2015.
 */
public class Task {

    private int idTask;
    private String name;
    private String description;
    private Date dateStart;
    private Date dateEnd;
    private Subject subject;
    private String status;

    public Task() {}

    public Task(int idTask, String name, String description, Date dateStart, Date dateEnd, Subject subject, String status) {
        this.idTask = idTask;
        this.name = name;
        this.description = description;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.subject = subject;
        this.status = status;
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

    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
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
