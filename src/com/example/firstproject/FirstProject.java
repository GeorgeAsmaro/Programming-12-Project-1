package com.example.firstproject;

import java.util.Scanner;
import java.util.Random;

public class FirstProject {

    //Adding a scanner called input into the project
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Start Menu");
        System.out.println("1. Data Converter");
        System.out.println("2. Grade Calculator");
        System.out.println("3. For Loop");
        System.out.println("4. While Loop");
        System.out.println("5. Tax calculator");
        System.out.println("6. Arrays/Lists");
        System.out.println("7. Exit");
        int num = input.nextInt();

        switch (num) {
            case 1 -> {
                System.out.println("Data Converter Started!");
                dataConverter();
            }
            case 2 -> {
                System.out.println("Grade Calculator Started!");
                gradeCalculator();
            }
            case 3 -> {
                System.out.println("For Loop Started!");
                forLoop();
            }
            case 4 -> {
                System.out.println("While Loop Started!");
                whileLoop();
            }
            case 5 -> {
                System.out.println("Tax Calculator Started!");
                taxCalculator();
            }
            case 6 -> {
                System.out.println("Arrays/Lists Started!");
                arrayOrLists();
            }
            case 7 -> System.exit(0);
            default -> System.out.println("You entered an invalid input!");
        }
    }

    public static void dataConverter() {

    }

    public static void gradeCalculator() {
        System.out.println("Enter your grade:");
        double grade = input.nextDouble();

        if (grade < 49 && grade >= 0) {
            System.out.println("You got an F, you failed.");
        }

         else if (grade >= 50 && grade <= 59) {
            System.out.println("You got a C-, you have passed!");
        }

        else if (grade >= 60 && grade <= 66) {
            System.out.println("You got a C, you have passed!");
        }

        else if (grade >= 67 && grade <= 72) {
            System.out.println("You got a C+, you have passed!");
        }

        else if (grade >=73 && grade <= 85) {
            System.out.println("You got a B, you have passed!");
        }

        else if (grade >= 86 && grade <= 99) {
            System.out.println("You got an A, you have passed!");
        }

        else if (grade == 100) {
            System.out.println("You got a perfect score, you have gotten an A and passed!");
        }

        else if (grade > 100) {
            System.out.println("You have gotten above 100 percent! That's an incredible feat!");
        }

        else if (grade < 0) {
            System.out.println("You... managed to get a grade below 0? As impressive as that is, you have unfortunately failed");
        }

        else {
            System.out.println("Invalid prompt, exiting..");
            System.exit(0);
        }

    }

    public static void forLoop() {
        System.out.println("Choose a starting number.");
        int start = input.nextInt();

        System.out.println("Choose an ending number.");
        int end = input.nextInt();

        System.out.println("Choose a gap.");
        int gap = input.nextInt();

        for(int i = start; i <= end; i += gap) {
            System.out.println(i);
            if (i >= end) {

                i = end;
                System.out.println("Finished.");
            }
        }
        }

    public static void whileLoop() {
        Random rand = new Random();

        int realNum = rand.nextInt(10);

        int guessedNum = 11;

        System.out.println("Guess the number! Find the number between 0-9");

        while(guessedNum != realNum) {
            guessedNum = input.nextInt();

            if (guessedNum == realNum) {
                System.out.println("You have guessed the correct number! The number was: " + realNum);
                break;
            }
        }
    }

    public static void taxCalculator() {

        System.out.println("Enter 1 to calculate tax. Enter 2 to see how many of an item you can buy.");
        int num2 = input.nextInt();

        switch(num2) {
            case 1: {
                System.out.println("Enter the price of the item.");

                double itemCost = input.nextDouble();

                double afterTax = itemCost * 1.12;

                System.out.println("The cost of your item after tax is: $" + afterTax);
            }

            case 2:   {
                System.out.println("Enter how much money you have.");
                double money = input.nextDouble();

                System.out.println("Enter how much the cost of your item costs");
                double itemCost = input.nextDouble();

                double numberBuyable = (money / itemCost);

                System.out.println("You are able to buy: " + (int)(numberBuyable) + " of that item.");
            }

            default: {

                if (num2 >= 3 || num2 <= 0) {
                    System.out.println("Invalid input.");
                    System.exit(0);
                }
            }

        }

    }

    public static void arrayOrLists() {

    }
}
