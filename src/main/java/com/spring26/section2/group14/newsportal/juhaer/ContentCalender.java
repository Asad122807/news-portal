package com.spring26.section2.group14.newsportal.juhaer;

import java.time.LocalDate;
import java.util.Locale;

public class ContentCalender {
    LocalDate Date,Deadline;
    String Title,Category,Priority,Reporter;

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public LocalDate getDeadline() {
        return Deadline;
    }

    public void setDeadline(LocalDate deadline) {
        Deadline = deadline;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getPriority() {
        return Priority;
    }

    public void setPriority(String priority) {
        Priority = priority;
    }

    public String getReporter() {
        return Reporter;
    }

    public void setReporter(String reporter) {
        Reporter = reporter;
    }

    @Override
    public String toString() {
        return "ContentCalender{" +
                "Date=" + Date +
                ", Deadline=" + Deadline +
                ", Title='" + Title + '\'' +
                ", Category='" + Category + '\'' +
                ", Priority='" + Priority + '\'' +
                ", Reporter='" + Reporter + '\'' +
                '}';
    }

    public ContentCalender(LocalDate date, LocalDate deadline, String title, String category, String priority, String reporter) {
        Date = date;
        Deadline = deadline;
        Title = title;
        Category = category;
        Priority = priority;
        Reporter = reporter;



    }
}
