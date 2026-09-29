package com.contextflow.ai.model;

public class ContextRequest {

    private String content;
    private String goal;

    public ContextRequest() {
    }

    public ContextRequest(String content, String goal) {
        this.content = content;
        this.goal = goal;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
}