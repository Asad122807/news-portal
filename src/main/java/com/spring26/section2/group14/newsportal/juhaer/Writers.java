package com.spring26.section2.group14.newsportal.juhaer;

import java.time.LocalDate;

public class Writers {
    String AssignedWriter,StakeholdersReq,AnalysisOfDetails,SendMassage;
    LocalDate TaskDeadline;

    public String getAssignedWriter() {
        return AssignedWriter;
    }

    public void setAssignedWriter(String assignedWriter) {
        AssignedWriter = assignedWriter;
    }

    public String getStakeholdersReq() {
        return StakeholdersReq;
    }

    public void setStakeholdersReq(String stakeholdersReq) {
        StakeholdersReq = stakeholdersReq;
    }

    public String getAnalysisOfDetails() {
        return AnalysisOfDetails;
    }

    public void setAnalysisOfDetails(String analysisOfDetails) {
        AnalysisOfDetails = analysisOfDetails;
    }

    public String getSendMassage() {
        return SendMassage;
    }

    public void setSendMassage(String sendMassage) {
        SendMassage = sendMassage;
    }

    public LocalDate getTaskDeadline() {
        return TaskDeadline;
    }

    public void setTaskDeadline(LocalDate taskDeadline) {
        TaskDeadline = taskDeadline;
    }

    @Override
    public String toString() {
        return "Writers{" +
                "AssignedWriter='" + AssignedWriter + '\'' +
                ", StakeholdersReq='" + StakeholdersReq + '\'' +
                ", AnalysisOfDetails='" + AnalysisOfDetails + '\'' +
                ", SendMassage='" + SendMassage + '\'' +
                ", TaskDeadline=" + TaskDeadline +
                '}';
    }

    public Writers(String assignedWriter) {
        AssignedWriter = assignedWriter;
        StakeholdersReq = stakeholdersReq;
        AnalysisOfDetails = analysisOfDetails;
        SendMassage = sendMassage;
        TaskDeadline = taskDeadline;

    }
}
