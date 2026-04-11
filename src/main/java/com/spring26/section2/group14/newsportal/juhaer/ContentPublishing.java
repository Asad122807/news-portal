package com.spring26.section2.group14.newsportal.juhaer;

import java.time.LocalDate;

public class ContentPublishing {
    String Status,AssignedWriter;
    LocalDate PublishTime;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getAssignedWriter() {
        return AssignedWriter;
    }

    public void setAssignedWriter(String assignedWriter) {
        AssignedWriter = assignedWriter;
    }

    public LocalDate getPublishTime() {
        return PublishTime;
    }

    public void setPublishTime(LocalDate publishTime) {
        PublishTime = publishTime;
    }

    @Override
    public String toString() {
        return "ContentPublishing{" +
                "Status='" + Status + '\'' +
                ", AssignedWriter='" + AssignedWriter + '\'' +
                ", PublishTime=" + PublishTime +
                '}';
    }

    public ContentPublishing(String status, String assignedWriter, LocalDate publishTime) {
        Status = status;
        AssignedWriter = assignedWriter;
        PublishTime = publishTime;

    }
}
