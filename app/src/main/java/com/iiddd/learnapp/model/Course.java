package com.iiddd.learnapp.model;

public class Course {

    int id;
    String image, title, date, level, color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Course(int id, String image, String title, String date, String level, String color) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.date = date;
        this.level = level;
        this.color = color;


    }
}
