package com.topicos.topicosandroid.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by maychellfernandesdeoliveira on 05/10/2015.
 */
public class Task extends Entity {

    public static final String CLASS_NAME = "tasks";
    private String name;
    private String description;
    private Date dateStart;
    private Date dateEnd;
    private Subject subject;
    private String status;
    private String attachment;

    public Task() {}

    public Task(String idTask, String name, String description, Date dateStart, Date dateEnd, Subject subject, String status, String attachment) {
        this.setId(idTask);
        this.name = name;
        this.description = description;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.subject = subject;
        this.status = status;
        this.attachment = attachment;
    }

    public static List<String> keys() {
        List<String> keys = new ArrayList<String>();

        keys.add(Task.ID);
        keys.add(Task.ATTACHMENT);
        keys.add(Task.SUBJECT);
        //keys.add(Task.DATE_START);
        keys.add(Task.DATE_END);
        keys.add(Task.DESCRIPTION);
        keys.add(Task.STATUS);
        keys.add(Task.NAME);

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

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public static final String ID = "id";
    public static final String ATTACHMENT = "attachment";
    public static final String SUBJECT = "course_title";
    //public static final String DATE_START = "created_at";
    public static final String DATE_END = "delivery_date";
    public static final String DESCRIPTION = "description";
    public static final String STATUS = "status";
    public static final String NAME = "title";

}
