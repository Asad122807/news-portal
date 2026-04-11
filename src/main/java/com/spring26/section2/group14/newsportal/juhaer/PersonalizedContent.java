package com.spring26.section2.group14.newsportal.juhaer;

import java.time.LocalDate;

public class PersonalizedContent {
    String ImageTone,headlineFormat,citationStyle,FormattingRules,TimeRange,Category,intrests,readingPerformance,contentFilteters;
    LocalDate Date;

    public String getImageTone() {
        return ImageTone;
    }

    public void setImageTone(String imageTone) {
        ImageTone = imageTone;
    }

    public String getHeadlineFormat() {
        return headlineFormat;
    }

    public void setHeadlineFormat(String headlineFormat) {
        this.headlineFormat = headlineFormat;
    }

    public String getCitationStyle() {
        return citationStyle;
    }

    public void setCitationStyle(String citationStyle) {
        this.citationStyle = citationStyle;
    }

    public String getFormattingRules() {
        return FormattingRules;
    }

    public void setFormattingRules(String formattingRules) {
        FormattingRules = formattingRules;
    }

    public String getTimeRange() {
        return TimeRange;
    }

    public void setTimeRange(String timeRange) {
        TimeRange = timeRange;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getIntrests() {
        return intrests;
    }

    public void setIntrests(String intrests) {
        this.intrests = intrests;
    }

    public String getReadingPerformance() {
        return readingPerformance;
    }

    public void setReadingPerformance(String readingPerformance) {
        this.readingPerformance = readingPerformance;
    }

    public String getContentFilteters() {
        return contentFilteters;
    }

    public void setContentFilteters(String contentFilteters) {
        this.contentFilteters = contentFilteters;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "PersonalizedContent{" +
                "ImageTone='" + ImageTone + '\'' +
                ", headlineFormat='" + headlineFormat + '\'' +
                ", citationStyle='" + citationStyle + '\'' +
                ", FormattingRules='" + FormattingRules + '\'' +
                ", TimeRange='" + TimeRange + '\'' +
                ", Category='" + Category + '\'' +
                ", intrests='" + intrests + '\'' +
                ", readingPerformance='" + readingPerformance + '\'' +
                ", contentFilteters='" + contentFilteters + '\'' +
                ", Date=" + Date +
                '}';
    }

    public PersonalizedContent(String imageTone, int i, int i1, String headlineFormat) {
        ImageTone = imageTone;
        this.headlineFormat = headlineFormat;
        this.citationStyle = citationStyle;
        FormattingRules = formattingRules;
        TimeRange = timeRange;
        Category = category;
        this.intrests = intrests;
        this.readingPerformance = readingPerformance;
        this.contentFilteters = contentFilteters;
        Date = date;

    }
}
