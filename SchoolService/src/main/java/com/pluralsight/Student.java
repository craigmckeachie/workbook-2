package com.pluralsight;

public class Student {
    private String firstName;
    private String lastName;
    private int age = 0;
    private String major = "";


    public Student(){
        this.firstName = "";
        this.lastName = "";
    }


   public Student(String firstName, String lastName){
      this.firstName = firstName;
      this.lastName = lastName;
   }

   public String getFirstName(){
       return firstName;
   }

   public void setFirstName(String firstName){
        this.firstName = firstName;
   }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }



}
