package com.spring26.section2.group14.newsportal.Asad;

public class ApproveArticleData
{
    private String serialNo;
    private String articleTitle;
    private String revised;
    private String writer;

    public ApproveArticleData(String serialNo, String articleTitle, String revised, String writer) {
        this.serialNo = serialNo;
        this.articleTitle = articleTitle;
        this.revised = revised;
        this.writer = writer;
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

    public String getRevised() {
        return revised;
    }

    public void setRevised(String revised) {
        this.revised = revised;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "ApproveArticleData{" +
                "serialNo='" + serialNo + '\'' +
                ", articleTitle='" + articleTitle + '\'' +
                ", revised='" + revised + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}