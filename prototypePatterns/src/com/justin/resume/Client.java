package com.justin.resume;

public class Client {
    public static void main(String[] args) {
        Resume resume1 = new Resume("justin");
        resume1.setPersonInfo("男", "23");
        resume1.setWorkExperience("2010-2015", "XX公司");

        Resume resume2 = resume1.clone();
        resume2.setWorkExperience("2015-2018", "YY公司");

        Resume resume3 = resume1.clone();
        resume3.setWorkExperience("2018-2021", "ZZ公司");

        resume1.display();
        resume2.display();
        resume3.display();
    }
}
