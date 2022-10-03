package com.example.firstproject;

import java.util.Scanner;

public class Person {

    Scanner input = new Scanner(System.in);
    int age;
    String name;
    String quote;

    public Person(int yourAge, String yourName, String favQuote) {
        age = yourAge;
        name = yourName;
        quote = favQuote;
    }

    public int getAge() {
        System.out.println("My age is: " + age);
        return age;
    }

    public int setAge() {
        System.out.println("Enter the age you would like to set");
        age = input.nextInt();
        System.out.println("Age is set to: " + age + " years old");
        return age;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public String setName() {
        System.out.println("Enter the name you would like to set");
        name = input.nextLine();
        System.out.println("Name is set to: " + name);
        return name;
    }

    public String getFavQuote() {
        System.out.println(quote);
        return quote;
    }

    public String setFavQuote() {
        System.out.println("Enter the quote you would like to set");
        quote = input.nextLine();
        System.out.println("Favourite quote is set to: " + quote);
        return quote;
    }

    public void getAll() {
        System.out.println("My name is " + name + " and I am " + age + " years old." );
        System.out.println("My favourite quote is: " + quote);
    }
}
