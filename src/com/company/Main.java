package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name");
        String firstName = scanner.nextLine();

        System.out.println("Enter the last name");
        String lastName = scanner.nextLine();

        System.out.println("Enter the sex");
        String sex = scanner.nextLine();

        System.out.println("Enter the age");
        int age = scanner.nextInt();

        System.out.println("Enter passport ID");
        String passportId = scanner.next();

        Person person = new Person(firstName, lastName, age, sex, passportId);
        person.personInfo();

    }
}
