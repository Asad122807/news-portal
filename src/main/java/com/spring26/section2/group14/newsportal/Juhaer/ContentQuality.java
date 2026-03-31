package com.spring26.section2.group14.newsportal.Juhaer;

public class ContentQuality {
    private String headline,author,category,sources;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSources() {
        return sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    @Override
    public String toString() {
        return "ContentQuality{" +
                "headline='" + headline + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", sources='" + sources + '\'' +
                '}';
    }

    public ContentQuality(String headline, String author, String category, String sources) {
        this.headline = headline;
        this.author = author;
        this.category = category;
        this.sources = sources;


    }
}
