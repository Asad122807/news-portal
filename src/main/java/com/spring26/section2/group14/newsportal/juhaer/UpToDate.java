package com.spring26.section2.group14.newsportal.juhaer;

public class UpToDate {
    String Topic,Category,Scources,LatestNews,RecentUpdates,TrendingTopic,Summary,Readers;

    public String getTopic() {
        return Topic;
    }

    public void setTopic(String topic) {
        Topic = topic;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getScources() {
        return Scources;
    }

    public void setScources(String scources) {
        Scources = scources;
    }

    public String getLatestNews() {
        return LatestNews;
    }

    public void setLatestNews(String latestNews) {
        LatestNews = latestNews;
    }

    public String getRecentUpdates() {
        return RecentUpdates;
    }

    public void setRecentUpdates(String recentUpdates) {
        RecentUpdates = recentUpdates;
    }

    public String getTrendingTopic() {
        return TrendingTopic;
    }

    public void setTrendingTopic(String trendingTopic) {
        TrendingTopic = trendingTopic;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }

    public String getReaders() {
        return Readers;
    }

    public void setReaders(String readers) {
        Readers = readers;
    }

    @Override
    public String toString() {
        return "UpToDate{" +
                "Topic='" + Topic + '\'' +
                ", Category='" + Category + '\'' +
                ", Scources='" + Scources + '\'' +
                ", LatestNews='" + LatestNews + '\'' +
                ", RecentUpdates='" + RecentUpdates + '\'' +
                ", TrendingTopic='" + TrendingTopic + '\'' +
                ", Summary='" + Summary + '\'' +
                ", Readers='" + Readers + '\'' +
                '}';
    }

    public UpToDate(String topic, String category, String scources, String latestNews, String recentUpdates, String trendingTopic, String summary, String readers) {
        Topic = topic;
        Category = category;
        Scources = scources;
        LatestNews = latestNews;
        RecentUpdates = recentUpdates;
        TrendingTopic = trendingTopic;
        Summary = summary;
        Readers = readers;
    }

    public char[] getHeadline() {
    }
}
