package com.pluralsight;

public class SchoolApplication {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Stanley");
        student.setLastName("Vargas");
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
    }
}
