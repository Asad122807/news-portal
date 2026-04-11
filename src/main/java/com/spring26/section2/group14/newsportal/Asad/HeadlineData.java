package com.spring26.section2.group14.newsportal.Asad;

public class HeadlineData {

    private String serialNo;
    private String articleTitle;
    private String writer;
    private String headline;

    public HeadlineData(String serialNo, String articleTitle, String writer, String headline) {
        this.serialNo = serialNo;
        this.articleTitle = articleTitle;
        this.writer = writer;
        this.headline = headline;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    @Override
    public String toString() {
        return "HeadlineData{" +
                "serialNo='" + serialNo + '\'' +
                ", articleTitle='" + articleTitle + '\'' +
                ", writer='" + writer + '\'' +
                ", headline='" + headline + '\'' +
                '}';
    }
}