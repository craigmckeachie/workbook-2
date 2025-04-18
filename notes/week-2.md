# Week 2 Notes

# Strings

## Comparing Strings (.equals())

#### Basic Example

Strings should always be compared:

- using the `.equals` method
- instead of using the `==` comparison operator

```java
String word1 = "apple";

if (word1.equals("apple")) {
    System.out.println("The words are equal.");
}
```

#### Ignoring case (case-insensitive)

```java
String word1 = "Apple";

if (word1.equalsIgnoreCase("apple")) {
    System.out.println("The words are equal (case-insensitive).");
}
```

## String Methods

```java
String productCode = "ACME-12213";
int dashPosition = productCode.indexOf("-");
String vendor = productCode.substring(0, dashPosition);
String productNum = productCode.substring(dashPosition+1);
System.out.println(vendor);
System.out.println(productNum);
// vendor contains ACME and productNum contains 12213
```

## Efficiently Building Strings (StringBuilder)

```java
StringBuilder sb = new StringBuilder();

sb.append("Hello");
sb.append(" ");
sb.append("world");
sb.append("!");

System.out.println(sb.toString());
```

```sh
Hello world!
```

</br>

---

# Classes

## Creating a Class

```java

public class Student {

}

```

## Adding Private Members

```java

public class Student {
    //field members
    private String firstName;
    private String lastName;

}

```

## Initializing Members in Default Constructor

```java
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

}

```

## Getters and Setters

```java
public class Student {
    //field members
    private String firstName;
    private String lastName;


    //constructor
    public Student(){
        this.firstName = "";
        this.lastName = "";
    }

    //getter
   public String getFirstName(){
       return this.firstName;
   }

   //setter
   public void setFirstName(String firstName){
        this.firstName = firstName;
   }

   //getter
    public String getLastName(){
        return this.lastName;
    }

    //setter
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}

```

## Initializing Fields in Constructor Method

```java
public class Student {
    //field members
    private String firstName;
    private String lastName;

    //constructor
    public Student(){
        this.firstName = "";
        this.lastName = "";
    }

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

}

```

## Creating an Object from a Class (instantiating)

```java
 //create an object (instance) of the Student class
//by calling the constructor function
Student student = new Student();
```

> Notes: </br> > `new` calls the constructor method </br>
> Class names use **PascalCasing**
> object names use **camelCasing**

## Adding Methods



Updated `Student` class with a `displayInfo()` method that prints the student's details in a nicely formatted way:

```java
public class Student {
    // field members
    private String firstName;
    private String lastName;

    // constructor
    public Student() {
        this.firstName = "";
        this.lastName = "";
    }

    // getter
    public String getFirstName() {
        return this.firstName;
    }

    // setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // getter
    public String getLastName() {
        return this.lastName;
    }

    // setter
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // display method
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name:  " + lastName);
    }
}
```

### Example usage:
```java
Student student = new Student();
student.setFirstName("Ava");
student.setLastName("Nguyen");
student.displayInfo();
```

### Output:
```
Student Information:
First Name: Ava
Last Name:  Nguyen
```



## Overloading Methods

# Loops

# Arrays
