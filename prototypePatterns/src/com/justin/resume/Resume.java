package com.justin.resume;

public class Resume implements Cloneable{
    private String name;
    private String sex;
    private String age;
    private WorkExperience workExperience;
    public Resume(String name){
        this.name = name;
        this.workExperience = new WorkExperience();
    }
    public void setPersonInfo(String sex, String age){
        this.sex = sex;
        this.age = age;
    }
    public void setWorkExperience(String timeArea, String company){
        this.workExperience.setCompany(company);
        this.workExperience.setTimeArea(timeArea);
    }
    public void display(){
        System.out.println(name + " " + sex + " " + age);
        System.out.println("工作经历：" + workExperience.getTimeArea() + " " + workExperience.getCompany());
    }
    public Resume clone(){
        Resume resume = null;
        try
            {
                resume = (Resume)super.clone();
                resume.workExperience = (WorkExperience)workExperience.clone();
            }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return resume;
    }

}
