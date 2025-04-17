package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Billing Street");
        String billingStreet = scanner.nextLine();

        System.out.println("Billing City");
        String billingCity = scanner.nextLine();

        System.out.println("Billing State");
        String billingState = scanner.nextLine();

        System.out.println("Billing Zip");
        String billingZip = scanner.nextLine();

        StringBuilder builder = new StringBuilder();
        builder.append(billingStreet).append("\n");
        builder.append(billingCity).append(" ,").append(billingState).append(" ").append(billingZip);

        String address = builder.toString();
        System.out.println(address);

    }


}
