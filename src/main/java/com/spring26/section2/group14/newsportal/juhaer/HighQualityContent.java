package com.spring26.section2.group14.newsportal.juhaer;

public class HighQualityContent {
    String Keywords,Categories,Filters,Tags,HomeFeed;

    public String getKeywords() {
        return Keywords;
    }

    public void setKeywords(String keywords) {
        Keywords = keywords;
    }

    public String getCategories() {
        return Categories;
    }

    public void setCategories(String categories) {
        Categories = categories;
    }

    public String getFilters() {
        return Filters;
    }

    public void setFilters(String filters) {
        Filters = filters;
    }

    public String getTags() {
        return Tags;
    }

    public void setTags(String tags) {
        Tags = tags;
    }

    public String getHomeFeed() {
        return HomeFeed;
    }

    public void setHomeFeed(String homeFeed) {
        HomeFeed = homeFeed;
    }

    @Override
    public String toString() {
        return "HighQualityContent{" +
                "Keywords='" + Keywords + '\'' +
                ", Categories='" + Categories + '\'' +
                ", Filters='" + Filters + '\'' +
                ", Tags='" + Tags + '\'' +
                ", HomeFeed='" + HomeFeed + '\'' +
                '}';
    }

    public HighQualityContent(String keywords, String categories, String filters, String tags) {
        Keywords = keywords;
        Categories = categories;
        Filters = filters;
        Tags = tags;
        HomeFeed = getHomeFeed();

    }

    public String getArticle() {
        return getArticle();
    }

    public String getAuthor() {
        return getAuthor();
    }
}
