package com.example.springsecurity.todo;

public class Todo {
    private String username;
    private String description;

    public Todo(String username, String description) {
        this.username = username;
        this.description = description;
    }

    public Todo() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
