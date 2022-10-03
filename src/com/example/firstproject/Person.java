package com.example.firstproject;

import java.util.Scanner;

public class Person {

    Scanner input = new Scanner(System.in);
    int age;
    String name;
    String quote;

    //Creates a constructor for the person class requiring an age, name and favourite quote
    public Person(int yourAge, String yourName, String favQuote) {
        age = yourAge;
        name = yourName;
        quote = favQuote;
    }
    //A getter for the age which prints the age given by the user
    public int getAge() {
        System.out.println("My age is: " + age);
        return age;
    }

    //A setter for the age which prints the age set by the user
    public int setAge() {
        System.out.println("Enter the age you would like to set");
        age = input.nextInt();
        System.out.println("Age is set to: " + age + " years old");
        return age;
    }

    //A getter for the name which prints the name given by the user
    public String getName() {
        System.out.println(name);
        return name;
    }

    //A setter for the name which prints the name set by the user
    public String setName() {
        System.out.println("Enter the name you would like to set");
        name = input.nextLine();
        System.out.println("Name is set to: " + name);
        return name;
    }

    //A getter for the quote which prints the quote given by the user
    public String getFavQuote() {
        System.out.println(quote);
        return quote;
    }

    //A setter for the quote which prints the quote set by the user
    public String setFavQuote() {
        System.out.println("Enter the quote you would like to set");
        quote = input.nextLine();
        System.out.println("Favourite quote is set to: " + quote);
        return quote;
    }

    //A getter for all the variables printing all the information given by the user
    public void getAll() {
        System.out.println("My name is " + name + " and I am " + age + " years old." );
        System.out.println("My favourite quote is: " + quote);
    }
}
