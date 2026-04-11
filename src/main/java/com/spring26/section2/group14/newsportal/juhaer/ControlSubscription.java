package com.spring26.section2.group14.newsportal.juhaer;

public class ControlSubscription {
    String AuthorProfile,AuthorName,Password,UpDateSourceRating,SourceFilter,KeyWordFilter;

    public String getAuthorProfile() {
        return AuthorProfile;
    }

    public void setAuthorProfile(String authorProfile) {
        AuthorProfile = authorProfile;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUpDateSourceRating() {
        return UpDateSourceRating;
    }

    public void setUpDateSourceRating(String upDateSourceRating) {
        UpDateSourceRating = upDateSourceRating;
    }

    public String getSourceFilter() {
        return SourceFilter;
    }

    public void setSourceFilter(String sourceFilter) {
        SourceFilter = sourceFilter;
    }

    public String getKeyWordFilter() {
        return KeyWordFilter;
    }

    public void setKeyWordFilter(String keyWordFilter) {
        KeyWordFilter = keyWordFilter;
    }

    @Override
    public String toString() {
        return "ControlSubscription{" +
                "AuthorProfile='" + AuthorProfile + '\'' +
                ", AuthorName='" + AuthorName + '\'' +
                ", Password='" + Password + '\'' +
                ", UpDateSourceRating='" + UpDateSourceRating + '\'' +
                ", SourceFilter='" + SourceFilter + '\'' +
                ", KeyWordFilter='" + KeyWordFilter + '\'' +
                '}';
    }

    public ControlSubscription(String authorProfile, String authorName, String password, String upDateSourceRating) {
        AuthorProfile = authorProfile;
        AuthorName = authorName;
        Password = password;
        UpDateSourceRating = upDateSourceRating;
        SourceFilter = sourceFilter;
        KeyWordFilter = keyWordFilter;
    }
}
