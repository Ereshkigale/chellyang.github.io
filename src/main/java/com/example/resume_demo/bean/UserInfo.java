package com.example.resume_demo.bean;

public class UserInfo {
    private String name;
    private String sex;
    private String age;
    private String address;
    private String specialty;
    private String education;
    private String school;

    private String job;
    private String resume;
    private String linkAddress;
    private String linkPhone;
    private String linkEmail;
    private String linkQq;
    private String linkWechat;

    public UserInfo(String name, String sex, String age, String address, String specialty, String education,
                    String school, String job, String resume,String linkAddress, String linkPhone, String linkEmail,
                    String linkQq, String linkWechat) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.specialty = specialty;
        this.education = education;
        this.school = school;
        this.linkAddress = linkAddress;
        this.linkPhone = linkPhone;
        this.linkEmail = linkEmail;
        this.linkQq = linkQq;
        this.linkWechat = linkWechat;
        this.job = job;
        this.resume = resume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getLinkAddress() {
        return linkAddress;
    }

    public void setLinkAddress(String linkAddress) {
        this.linkAddress = linkAddress;
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone;
    }

    public String getLinkEmail() {
        return linkEmail;
    }

    public void setLinkEmail(String linkEmail) {
        this.linkEmail = linkEmail;
    }

    public String getLinkQq() {
        return linkQq;
    }

    public void setLinkQq(String linkQq) {
        this.linkQq = linkQq;
    }

    public String getLinkWechat() {
        return linkWechat;
    }

    public void setLinkWechat(String linkWechat) {
        this.linkWechat = linkWechat;
    }
}
