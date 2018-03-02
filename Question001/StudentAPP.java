package com.company;
import java.util.Scanner;

public class StudentAPP {

    public static void main(String[] args) {

        //set Student allocations using array

        Scanner scan = new Scanner(System.in);

        Student[] studentList = new Student[6];

        studentList[1] = new Student("Jason","IT","3897483");
        studentList[2] = new Student("Brandon","IT","2383");
        studentList[3] = new Student("Nelson","Business","483");
        studentList[4] = new Student("Whane","Eng","97483");
        studentList[5] = new Student("Smith","IT","56973");



        for(int i = 0 ; i<studentList.length ; ++i) {
            studentList[1].printDetails();

        }

    }
}
