package com.spring26.section2.group14.newsportal.juhaer;

public class ContentPerformance {
    String TimeRange,Category;

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

    @Override
    public String toString() {
        return "ContentPerformance{" +
                "TimeRange='" + TimeRange + '\'' +
                ", Category='" + Category + '\'' +
                '}';
    }

    public ContentPerformance(String timeRange, String category, int i, String general, String normal) {
        TimeRange = timeRange;
        Category = category;

    }
}
