package com.example.resume_demo.bean;

import java.util.Date;

public class Work {
    private String companyName;
    private String companyImg;
    private String job;
    private Date startTime;
    private Date endTime;
    private String workContent;

    public Work(String companyName, String companyImg, String job, Date startTime, Date endTime, String workContent) {
        this.companyName = companyName;
        this.companyImg = companyImg;
        this.job = job;
        this.startTime = startTime;
        this.endTime = endTime;
        this.workContent = workContent;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyImg() {
        return companyImg;
    }

    public void setCompanyImg(String companyImg) {
        this.companyImg = companyImg;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getWorkContent() {
        return workContent;
    }

    public void setWorkContent(String workContent) {
        this.workContent = workContent;
    }
}
