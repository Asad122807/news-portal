package com.spring26.section2.group14.newsportal.juhaer;

public class SEOOptimization {
    String ArticlesWithSEO,Headline,MetaTitle,MetaDescription,FocusKeywords,InternalLinks;

    public String getArticlesWithSEO() {
        return ArticlesWithSEO;
    }

    public void setArticlesWithSEO(String articlesWithSEO) {
        ArticlesWithSEO = articlesWithSEO;
    }

    public String getHeadline() {
        return Headline;
    }

    public void setHeadline(String headline) {
        Headline = headline;
    }

    public String getMetaTitle() {
        return MetaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        MetaTitle = metaTitle;
    }

    public String getMetaDescription() {
        return MetaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        MetaDescription = metaDescription;
    }

    public String getFocusKeywords() {
        return FocusKeywords;
    }

    public void setFocusKeywords(String focusKeywords) {
        FocusKeywords = focusKeywords;
    }

    public String getInternalLinks() {
        return InternalLinks;
    }

    public void setInternalLinks(String internalLinks) {
        InternalLinks = internalLinks;
    }

    @Override
    public String toString() {
        return "SEOOptimization{" +
                "ArticlesWithSEO='" + ArticlesWithSEO + '\'' +
                ", Headline='" + Headline + '\'' +
                ", MetaTitle='" + MetaTitle + '\'' +
                ", MetaDescription='" + MetaDescription + '\'' +
                ", FocusKeywords='" + FocusKeywords + '\'' +
                ", InternalLinks='" + InternalLinks + '\'' +
                '}';
    }

    public SEOOptimization(String articlesWithSEO, String headline, String metaTitle, String metaDescription, String focusKeywords, String internalLinks) {
        ArticlesWithSEO = articlesWithSEO;
        Headline = headline;
        MetaTitle = metaTitle;
        MetaDescription = metaDescription;
        FocusKeywords = focusKeywords;
        InternalLinks = internalLinks;

    }
}
