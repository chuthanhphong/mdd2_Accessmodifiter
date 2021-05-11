package com.codegym;

public class Testmethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111,"Chương");
        Student s2 = new Student(222, "Tuyền");
        Student s3 = new Student(333,"Chiến");
        s1.display();
        s2.display();
        s3.display();
    }


}
