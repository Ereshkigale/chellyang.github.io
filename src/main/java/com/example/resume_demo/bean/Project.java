package com.example.resume_demo.bean;

import java.awt.*;

public class Project {
    private String projectName;
    private String projectSkill;
    private String projectTime;
    private String projectDetails;
    private String projectImg;
    private String projectClass;

    public Project(String projectName, String projectSkill, String projectTime, String projectDetails, String projectImg,String projectClass) {
        this.projectName = projectName;
        this.projectSkill = projectSkill;
        this.projectTime = projectTime;
        this.projectDetails = projectDetails;
        this.projectImg = projectImg;
        this.projectClass = projectClass;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectSkill() {
        return projectSkill;
    }

    public void setProjectSkill(String projectSkill) {
        this.projectSkill = projectSkill;
    }

    public String getProjectTime() {
        return projectTime;
    }

    public void setProjectTime(String projectTime) {
        this.projectTime = projectTime;
    }

    public String getProjectDetails() {
        return projectDetails;
    }

    public void setProjectDetails(String projectDetails) {
        this.projectDetails = projectDetails;
    }

    public String getProjectImg() {
        return projectImg;
    }

    public void setProjectImg(String projectImg) {
        this.projectImg = projectImg;
    }

    public String getProjectClass() {
        return projectClass;
    }

    public void setProjectClass(String projectClass) {
        this.projectClass = projectClass;
    }
}
