package com.spring26.section2.group14.newsportal.Asad;

public class EditArticleStep
{
    private String event;
    private String description;
    private String type;

    public EditArticleStep(String event, String description, String type) {
        this.event = event;
        this.description = description;
        this.type = type;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "EditArticleStep{" +
                "event='" + event + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}