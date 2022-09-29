package com.example.firstproject;

//Importing the scanner into the class
import java.util.Scanner;

//Importing the random number generator into the class
import java.util.Random;

public class FirstProject {

    //Adding a scanner called input into the project
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //Printing the start menu
        System.out.println("Start Menu");
        System.out.println("1. Data Converter");
        System.out.println("2. Grade Calculator");
        System.out.println("3. For Loop");
        System.out.println("4. While Loop");
        System.out.println("5. Tax calculator");
        System.out.println("6. Arrays/Lists");
        System.out.println("7. Exit");

        //Asking for an input from the user, in this case as a String
        String num = input.nextLine();

        //Choosing the method to go to based on the string given
        switch (num) {
            case "1" -> {
                //If the user chooses "1", start the data converter method
                System.out.println("Data Converter Started!");
                dataConverter();
            }
            case "2" -> {
                //If the user chooses "2", start the grade calculator method
                System.out.println("Grade Calculator Started!");
                gradeCalculator();
            }
            case "3" -> {
                //If the user chooses "3", start the for loop method
                System.out.println("For Loop Started!");
                forLoop();
            }
            case "4" -> {
                //If the user chooses "4", start the while loop method
                System.out.println("While Loop Started!");
                whileLoop();
            }
            case "5" -> {
                //If the user chooses "5", start the tax calculator method
                System.out.println("Tax Calculator Started!");
                taxCalculator();
            }
            case "6" -> {
                //If the user chooses "6", start the arrays/lists method
                System.out.println("Arrays/Lists Started!");
                arrayOrLists();
            }

            //If the user chooses "7", print a message and exit
            case "7" -> {
                System.out.println("Exiting...");
                System.exit(0);
            }

            //Putting a message for a failed output
            default -> System.out.println("You entered an invalid input!");
        }
    }

    public static void dataConverter() {
        System.out.println("Press 1 to convert a string to int, 2 to convert an int to double, 3 to convert an int to a float, 4 to convert a double to an int");
        String num = input.nextLine();
        switch(num) {
            case "1" -> {
                //If the user chooses "1", information is needed for the string to turn into an int

            }
            case "2" -> {
                //If the user chooses "2", information is needed for the int to turn into a double

            }
            case "3" -> {
                //If the user chooses "3", information is needed for the int to turn into a float

            }
            case "4" -> {
                //If the user chooses "4", information is needed for the double to turn into an int

            }

            default -> {

            }
        }
    }

    public static void gradeCalculator() {
        System.out.println("Enter your grade:");

        //Making the grade a double in order to have decimals in the percentages
        double grade = input.nextDouble();

        //If statement for a failing grade
        if (grade < 49 && grade >= 0) {
            System.out.println("You got an F, you failed.");
        }

        //If statement for a C-. Using < and not <= to let decimals be accepted.
         else if (grade >= 50 && grade < 60) {
            System.out.println("You got a C-, you have passed!");
        }

         //If statement for a C. Using < and not <= to let decimals be accepted.
        else if (grade >= 60 && grade < 67) {
            System.out.println("You got a C, you have passed!");
        }

        //If statement for a C+. Using < and not <= to let decimals be accepted.
        else if (grade >= 67 && grade < 73) {
            System.out.println("You got a C+, you have passed!");
        }

        //If statement for a B. Using < and not <= to let decimals be accepted.
        else if (grade >=73 && grade < 86) {
            System.out.println("You got a B, you have passed!");
        }

        //If statement for an A. Using < and not <= to let decimals be accepted.
        else if (grade >= 86 && grade < 100) {
            System.out.println("You got an A, you have passed!");
        }

        //If statement for a perfect score. The number can only be 100 and nothing else.
        else if (grade == 100) {
            System.out.println("You got a perfect score, you have gotten an A and passed!");
        }

        //If statement for a grade above perfect. The number has to be above 100.
        else if (grade > 100) {
            System.out.println("You have gotten above 100 percent! That's an incredible feat!");
        }

        //If statement for a grade less than 0. The number has to be less than 0.
        else if (grade < 0) {
            System.out.println("You... managed to get a grade below 0? As impressive as that is, you have unfortunately failed");
        }

        //Otherwise, the output given by the user was invalid, and therefore the code is forced to exit
        else {
            System.out.println("Invalid prompt, exiting..");
            System.exit(0);
        }

    }

    public static void forLoop() {

        //Getting information for the starting number
        System.out.println("Choose a starting number.");
        int start = input.nextInt();

        //Getting information for the ending number
        System.out.println("Choose an ending number.");
        int end = input.nextInt();

        //Getting information for the gap between the starting and ending number
        System.out.println("Choose a gap.");
        int gap = input.nextInt();

        //For every time that start is less than end, add the gap to start and print it out until the starting number is greater than or equal to the ending number
        for(int i = start; i <= end; i += gap) {
            System.out.println(i);
        }

    }

    public static void whileLoop() {
        //Implementing the number generator from the library that was imported
        Random rand = new Random();

        //Generating a number from 0-9
        int realNum = rand.nextInt(10);

        //Making the number outside those bounds by default, so it doesn't solve without the user typing anything
        int guessedNum = 11;

        System.out.println("Guess the number! Find the number between 0-9");

        //While the guessed number isn't equal to the number randomly generated, keep asking the user to put in another prompt
        while(guessedNum != realNum) {
            guessedNum = input.nextInt();

            //If the number you guessed mod 2 is equal to 0 AND the randomly generated number mod 2 is also equal to 0, print a message saying that both numbers are even
            if(guessedNum % 2 == 0) {
                if(realNum % 2 == 0) {
                    System.out.println("Both the number you guessed and the randomly generated number are even");
                }
            }

            //If the number you guessed mod 2 is equal to 1 AND the randomly generated number mod 2 is also equal to 1, print a message saying that both numbers are odd
            if(guessedNum % 2 == 1) {
                if(realNum % 2 == 1) {
                    System.out.println("Both the number you guessed and the randomly generated number are odd");
                }
            }

            //If the guessed number is equal to the generated number, print a message and break out of the while loop;
            if (guessedNum == realNum) {
                System.out.println("You have guessed the correct number! The number was: " + realNum);
                break;
            }
        }
    }

    public static void taxCalculator() {

        //Give the user the choice of which type of calculator they want to do
        System.out.println("Enter 1 to calculate tax. Enter 2 to see how many of an item you can buy.");
        int num2 = input.nextInt();

        //Creating a switch case to see which of the 2 scenarios is wanted
        switch(num2) {
            case 1: {
                System.out.println("Enter the price of the item.");

                //Get the price of the item from the user
                double itemCost = input.nextDouble();

                //Multiply the price of the item by the tax rate in British Columbia, which is currently 12%
                double afterTax = itemCost * 1.12;

                //Print out the price of the item after tax
                System.out.println("The cost of your item after tax is: $" + afterTax);
            }

            case 2:   {

                //Get the amount of money that the user has
                System.out.println("Enter how much money you have.");
                double money = input.nextDouble();

                //Get the cost of the item the user has
                System.out.println("Enter the cost of your item.");
                double itemCost = input.nextDouble();

                //Divide the amount of money by the cost of the item to get the double of how many of that item you can get
                double numberBuyable = (money / itemCost);

                //Print the int of how many of that item you can have, because you can't have a piece of an item and only a whole item
                System.out.println("You are able to buy: " + (int)(numberBuyable) + " of that item.");
            }

            default: {

                //If the number is greater than or equal to 3 OR the number is less than or equal to 0, print that the input was invalid and exit
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
