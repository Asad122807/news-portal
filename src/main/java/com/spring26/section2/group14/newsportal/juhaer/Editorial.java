package com.spring26.section2.group14.newsportal.juhaer;
import java.time.LocalDate;

public class Editorial {
    private String title;
    private String category;
    private String languageTone;
    private LocalDate effectiveDate;

    public Editorial(String title, String category, String languageTone, LocalDate effectiveDate) {
        this.title = title;
        this.category = category;
        this.languageTone = languageTone;
        this.effectiveDate = effectiveDate;
    }

    public static void add(Editorial newGuideline) {

    }


    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public String getLanguageTone() { return languageTone; }
    public LocalDate getEffectiveDate() { return effectiveDate; }
}
