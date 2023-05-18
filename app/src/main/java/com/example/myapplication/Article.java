package com.example.myapplication;

import java.util.Date;

public class Article {
    private String title;
    private String content;
    private Date date;

    public Article(String title, String content, Date date) {
        this.title = title;
        this.content = content;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getDate() {
        return date;
    }
}

