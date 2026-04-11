package com.spring26.section2.group14.newsportal.juhaer;

public class ContentEngagement {
    String Edit,Articles,ThumbnailURL,Summmary;

    public ContentEngagement(int i, int i1, String thumbnailURL, int i2, String s) {
    }

    public String getEdit() {
        return Edit;
    }

    public void setEdit(String edit) {
        Edit = edit;
    }

    public String getArticles() {
        return Articles;
    }

    public void setArticles(String articles) {
        Articles = articles;
    }

    public String getThumbnailURL() {
        return ThumbnailURL;
    }

    public void setThumbnailURL(String thumbnailURL) {
        ThumbnailURL = thumbnailURL;
    }

    public String getSummmary() {
        return Summmary;
    }

    public void setSummmary(String summmary) {
        Summmary = summmary;
    }

    @Override
    public String toString() {
        return "ContentEngagement{" +
                "Edit='" + Edit + '\'' +
                ", Articles='" + Articles + '\'' +
                ", ThumbnailURL='" + ThumbnailURL + '\'' +
                ", Summmary='" + Summmary + '\'' +
                '}';
    }

    public ContentEngagement(String edit, String articles, String thumbnailURL, String summmary) {
        Edit = edit;
        Articles = articles;
        ThumbnailURL = thumbnailURL;
        Summmary = summmary;

    }
}
