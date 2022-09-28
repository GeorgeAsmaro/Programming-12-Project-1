package com.example.firstproject;

import java.util.Scanner;

public class FirstProject {

    //Adding a scanner called input into the project
    Scanner input = new Scanner(System.in);

    public void main(String[] args) {
        System.out.println("Start Menu");
        System.out.println("1. Data Converter");
        System.out.println("2. Grade Calculator");
        System.out.println("3. For Loop");
        System.out.println("4. While Loop");
        System.out.println("5. Tax calculator");
        System.out.println("6. Arrays/Lists");
        System.out.println("7. Exit");
        int num = input.nextInt();

        switch(num) {
            case 1:
                System.out.println("Data Converter Started!");
                dataConverter();
                break;
            case 2:
                System.out.println("Grade Calculator Started!");
                gradeCalculator();
                break;
            case 3:
                System.out.println("For Loop Started!");
                forLoop();
                break;
            case 4:
                System.out.println("While Loop Started!");
                whileLoop();
                break;
            case 5:
                System.out.println("Tax Calculator Started!");
                taxCalculator();
                break;
            case 6:
                System.out.println("Arrays/Lists Started!");
                arrayOrLists();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("You entered an invalid input!");
                break;
        }
    }

    public void dataConverter() {

    }

    public void gradeCalculator() {
        System.out.println("Enter your grade:");
        double grade = input.nextDouble();

        if (grade < 49 && grade >= 0) {
            System.out.println("You got an F, you failed.");
        }

        if (grade >= 50 && grade <= 59) {
            System.out.println("You got a C-, you have passed!");
        }

        if (grade >= 60 && grade <= 66) {
            System.out.println("You got a C, you have passed!");
        }

        if (grade >= 67 && grade <= 72) {
            System.out.println("You got a C+, you have passed!");
        }

        if (grade >=73 && grade <= 85) {
            System.out.println("You got a B, you have passed!");
        }

        if (grade >= 86 && grade <= 99) {
            System.out.println("You got an A, you have passed!");
        }

        if (grade == 100) {
            System.out.println("You got a perfect score, you have gotten an A and passed!");
        }

        if (grade > 100) {
            System.out.println("You have gotten above 100 percent! That's an incredible feat!");
        }

        if (grade < 0) {
            System.out.println("You... managed to get a grade below 0? As impressive as that is, you have unfortunately failed");
        }

        else {
            System.out.println("Invalid prompt, exiting..");
            System.exit(0);
        }

    }

    public void forLoop() {

    }

    public void whileLoop() {

    }

    public void taxCalculator() {

    }

    public void arrayOrLists() {

    }
}
