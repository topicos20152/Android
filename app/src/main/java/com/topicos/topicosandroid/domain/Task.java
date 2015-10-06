package com.topicos.topicosandroid.domain;

/**
 * Created by maychellfernandesdeoliveira on 05/10/2015.
 */
public class Task {

    private String title;
    private String status;
    private String beginsAt;
    private String endsAt;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getBeginsAt() {
        return beginsAt;
    }
    public void setBeginsAt(String beginsAt) {
        this.beginsAt = beginsAt;
    }
    public String getEndsAt() {
        return endsAt;
    }
    public void setEndsAt(String endsAt) {
        this.endsAt = endsAt;
    }
}
