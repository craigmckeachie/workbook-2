package com.pluralsight;

public class Student {
    //field members
    private String firstName;
    private String lastName;


    //constructor
    public Student(){
        this.firstName = "";
        this.lastName = "";
    }

//this constructor not needed for exercise
//   public Student(String firstName, String lastName){
//      this.firstName = firstName;
//      this.lastName = lastName;
//   }

    //getter
   public String getFirstName(){
       return firstName;
   }

   //setter
   public void setFirstName(String firstName){
        this.firstName = firstName;
   }

   //getter
    public String getLastName(){
        return lastName;
    }

    //setter
    public void setLastName(String lastName){
        this.lastName = lastName;
    }



}
