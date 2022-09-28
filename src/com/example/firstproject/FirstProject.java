package com.example.firstproject;

import java.util.Scanner;

public class FirstProject {

    public void main(String[] args) {

        //Adding a scanner called input into the project
        Scanner input = new Scanner(System.in);
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
