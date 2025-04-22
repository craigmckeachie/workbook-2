package com.pluralsight;

public class SchoolApplication {

    public static void main(String[] args) {
        //create an object (instance) of the Student class
        //by calling the constructor function
        Student student = new Student();

        //set data using the setters to set private field member variables
        student.setFirstName("Stanley");
        student.setLastName("Vargas");

        //get data using the getters to access the private field member variables
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());

                                  0          , 1        ,    2
        Student[] students =  {new Student(), new Student(), new Student};


    }
}
