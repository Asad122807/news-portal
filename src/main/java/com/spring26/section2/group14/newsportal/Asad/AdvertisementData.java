package com.spring26.section2.group14.newsportal.Asad;

public class AdvertisementData
{
    private String serialNo;
    private String adTitle;
    private String advertiserName;
    private String platform;
    private String budget;
    private String status;

    public AdvertisementData(String serialNo, String adTitle, String advertiserName, String platform, String budget, String status) {
        this.serialNo = serialNo;
        this.adTitle = adTitle;
        this.advertiserName = advertiserName;
        this.platform = platform;
        this.budget = budget;
        this.status = status;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getAdTitle() {
        return adTitle;
    }

    public void setAdTitle(String adTitle) {
        this.adTitle = adTitle;
    }

    public String getAdvertiserName() {
        return advertiserName;
    }

    public void setAdvertiserName(String advertiserName) {
        this.advertiserName = advertiserName;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AdvertisementData{" +
                "serialNo='" + serialNo + '\'' +
                ", adTitle='" + adTitle + '\'' +
                ", advertiserName='" + advertiserName + '\'' +
                ", platform='" + platform + '\'' +
                ", budget='" + budget + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}