package com.company;

public class Student {

    private int studentID;
    private String studentName;
    private String degree;
    private String mobile;
    private static int max = 100;

    public Student(String studentName,String degree,String mobile) {
        this.studentName=studentName;
        this.degree=degree;
        this.mobile=mobile;
    }


    public String getStudentName() {
        return studentName;
    }


    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }



    public String getDegree() {
        return degree;
    }



    public void setDegree(String degree) {
        this.degree = degree;
    }




    public String getMobile() {
        return mobile;
    }



    public void setMobile(String mobile) {
        this.mobile = mobile;
    }



    //System Generate Unique ID for each Student Using Static Obj

    public int getNextStudentID() {

        max++;
        return studentID+max;
    }

    //printing details
    public void printDetails() {
        System.out.println();
        System.out.println();
        System.out.println("********************************************");
        System.out.println("Student Name    :"+getStudentName());
        System.out.println("Student Degree  :"+getDegree());
        System.out.println("Student Mobile No  :"+getMobile());
        System.out.println();
        System.out.println("System Generated Student ID   :"+getNextStudentID());
        System.out.println("********************************************");

    }
}
