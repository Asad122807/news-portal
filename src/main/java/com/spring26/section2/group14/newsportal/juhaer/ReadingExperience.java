package com.spring26.section2.group14.newsportal.juhaer;

public class ReadingExperience {
    String ArticleReader;

    public String getArticleReader() {
        return ArticleReader;
    }

    public void setArticleReader(String articleReader) {
        ArticleReader = articleReader;
    }

    @Override
    public String toString() {
        return "ReadingExperience{" +
                "ArticleReader='" + ArticleReader + '\'' +
                '}';
    }

    public ReadingExperience(String articleReader) {
        ArticleReader = articleReader;

    }
}
