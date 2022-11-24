package com.company.models;

public class User {

    private Long UserId;
    private Long Id;
    private String title;
    private String body;

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserId=" + UserId +
                ", Id=" + Id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
