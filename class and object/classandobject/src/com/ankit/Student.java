package com.ankit;

public class Student {
    private String name;
    final private int rollNo;
    private  int marks;
    private static int numOfStudnets ;
    


    Student(String name , int rollNo,int marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        numOfStudnets++;

    }
    public String getName() {
        return name;
        }
        public int getRollNo() {
            return rollNo;
            }
            public  int getMarks(){
                return marks;
            }
            public  int getNumOfStudents(){
                return numOfStudnets;
            }
            


}
