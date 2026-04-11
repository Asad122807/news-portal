package com.spring26.section2.group14.newsportal.juhaer;

import java.time.LocalDate;

public class ContentSource {
    String meter,Despitation,Status;
    LocalDate Date;

    public String getMeter() {
        return meter;
    }

    public void setMeter(String meter) {
        this.meter = meter;
    }

    public String getDespitation() {
        return Despitation;
    }

    public void setDespitation(String despitation) {
        Despitation = despitation;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "ContentSource{" +
                "meter='" + meter + '\'' +
                ", Despitation='" + Despitation + '\'' +
                ", Status='" + Status + '\'' +
                ", Date=" + Date +
                '}';
    }

    public ContentSource(String meter, String despitation, String status,LocalDate date) {
        this.meter = meter;
        Despitation = despitation;
        Status = status;
        Date = date;

    }
}
