package com.spring26.section2.group14.newsportal.juhaer;

import java.time.LocalDate;

public class EngageWithContent {
    String Reading;

    public String getReading() {
        return Reading;
    }

    public void setReading(String reading) {
        Reading = reading;
    }

    @Override
    public String toString() {
        return "EngageWithContent{" +
                "Reading='" + Reading + '\'' +
                '}';
    }

    public EngageWithContent(String reading, LocalDate localDate, String article, String s) {
        Reading = reading;
    }
}
