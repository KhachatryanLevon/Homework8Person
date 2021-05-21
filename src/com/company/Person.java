package com.company;

import java.util.Scanner;

public class Person {

    Scanner scanner = new Scanner(System.in);
    private String firstName = "";
    private String lastName = "";
    private int age = 0;
    private String sex = "";
    private String passportId = "";
    private String sexMale = "male";
    private String sexFemale = "female";


    private String getPassportId() {
        return passportId;
    }

    private void setPassportId(String passportId) {

        while (passportId.charAt(0) != 'A' || passportId.charAt(1) != 'N' || passportId.length() != 8) {
            System.out.println("Passport ID is incorrect. It should be written in the form AN123456. Please enter the correct passport ID");
            passportId = scanner.nextLine();
        }
        this.passportId = passportId;
    }


    private String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        while (firstName.length() < 3 || firstName.length() > 15) {
            System.out.println("Name is incorrect. It should contain from 3 to 15 symbols. Please enter another first name");
            firstName = scanner.nextLine();
        }
        this.firstName = firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        while (lastName.length() < 6 || lastName.length() > 20) {
            System.out.println("Last name is incorrect. It should contain from 6 to 20 symbols. Please enter another last name");
            lastName = scanner.nextLine();
        }
        this.lastName = lastName;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        while (age < 18 || age > 100) {
            System.out.println("Age is incorrect. It should be in the range 18-99. Please enter another age");
            age = scanner.nextInt();
        }
        this.age = age;
    }

    private String getSex() {
        return sex;
    }

    private void setSex(String sex) {
        while (sex.compareToIgnoreCase(sexFemale) != 0 && sex.compareToIgnoreCase(sexMale) != 0) {
            System.out.println("Sex is incorrect. It should be male or female. Please enter the correct sex");
            sex = scanner.nextLine();
        }
        this.sex = sex;
    }


    public Person(String firstName, String lastName, int age, String sex, String passportId) {
        setFirstName(firstName);
        setLastName(lastName);
        setSex(sex);
        setAge(age);
        setPassportId(passportId);
    }

    public void personInfo() {
        System.out.println("*** Person info ***");
        System.out.println("Name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Sex: " + getSex());
        System.out.println("Age: " + getAge());
        System.out.println("Passport Id: " + getPassportId());
    }


}
