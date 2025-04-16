package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    public static void print(String message){
        System.out.println(message);
    }

  
    public static void main(String[] args) {
        String fullName = promptForString("Please enter your full name: ");

        int positionOfFirstSpace = fullName.indexOf(' ');
        int positionOfSecondSpace = fullName.lastIndexOf(' ');

        String firstName = "";
        String middleName = "";
        String lastName = "";
        if(positionOfFirstSpace == -1){
            firstName= fullName;
        }else{
            firstName= fullName.substring(0,positionOfFirstSpace);
        }

        if(positionOfFirstSpace != positionOfSecondSpace) {
            middleName = fullName.substring(positionOfFirstSpace+1,positionOfSecondSpace);
            lastName = fullName.substring(positionOfSecondSpace+1);
        }else{
            lastName = fullName.substring(positionOfFirstSpace+1);
        }

        print(firstName);

        if (!middleName.isEmpty()) {
            print(middleName);
        }

        if (!lastName.isEmpty()){
            print(lastName);
        }
    }

    private static String promptForString(String prompt) {
        print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}
