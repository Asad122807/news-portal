package com.spring26.section2.group14.newsportal.Asad;

public class ArticleReviewStep {
    private String event;
    private String description;
    private String type;

    public ArticleReviewStep(String event, String description, String type) {
        this.event = event;
        this.description = description;
        this.type = type;
    }

    public String getEvent() {
        return event;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ArticleReviewStep{" +
                "event='" + event + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}