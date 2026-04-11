package com.spring26.section2.group14.newsportal.juhaer;

public class GainValue {
    String SourceFilter,UpDateSourceRating;

    public String getSourceFilter() {
        return SourceFilter;
    }

    public void setSourceFilter(String sourceFilter) {
        SourceFilter = sourceFilter;
    }

    public String getUpDateSourceRating() {
        return UpDateSourceRating;
    }

    public void setUpDateSourceRating(String upDateSourceRating) {
        UpDateSourceRating = upDateSourceRating;
    }

    @Override
    public String toString() {
        return "GainValue{" +
                "SourceFilter='" + SourceFilter + '\'' +
                ", UpDateSourceRating='" + UpDateSourceRating + '\'' +
                '}';
    }

    public GainValue(String sourceFilter, String upDateSourceRating, String selectedRating, String verifiedNow) {
        SourceFilter = sourceFilter;
        UpDateSourceRating = upDateSourceRating;

    }
}
