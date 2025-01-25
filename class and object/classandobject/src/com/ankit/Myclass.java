package com.ankit;

public class Myclass {
        public static void main(String[] args){
            Student s1 = new Student("Ankit",1,90);
            System.out.println(s1.getMarks());         
            System.out.println(s1.getName());   
            System.out.println(s1.getRollNo());
            Student s2 ;
            Student s3;
            s3 = new Student(null, 0, 0);
            System.out.println(  s2= new Student("gfg",4,8));
            System.out.println(s2.getNumOfStudents());
            System.out.println(s3.getNumOfStudents());
        }
}

