package com.justin.resume;

public class WorkExperience implements Cloneable{
    private String timeArea;
    private String company;

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public WorkExperience clone() {
        WorkExperience workExperience = null;
        try {
            workExperience = (WorkExperience) super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("clone异常");
        }
        return workExperience;
    }
}
