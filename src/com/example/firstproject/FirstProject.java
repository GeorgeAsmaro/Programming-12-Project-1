package com.example.firstproject;

//Importing arrays into the class
import java.util.Arrays;

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
        System.out.println("7. Person Class");
        System.out.println("8. Exit");

        //Asking for an input from the user, in this case as a String
        String num = input.nextLine();

        //Choosing the method to go to based on the string given
        switch (num) {
            case "1": {
                //If the user chooses "1", start the data converter method
                System.out.println("Data Converter Started!");
                dataConverter();
            }
            case "2": {
                //If the user chooses "2", start the grade calculator method
                System.out.println("Grade Calculator Started!");
                gradeCalculator();
            }
            case "3": {
                //If the user chooses "3", start the for loop method
                System.out.println("For Loop Started!");
                forLoop();
            }
            case "4": {
                //If the user chooses "4", start the while loop method
                System.out.println("While Loop Started!");
                whileLoop();
            }
            case "5": {
                //If the user chooses "5", start the tax calculator method
                System.out.println("Tax Calculator Started!");
                taxCalculator();
            }
            case "6": {
                //If the user chooses "6", start the arrays/lists method
                System.out.println("Arrays/Lists Started!");
                arrayOrLists();
            }

            case "7": {
                //If the user chooses "7", start the person class method
                System.out.println("Person Class Started!");
                personClass();

            }

            //If the user chooses "8", print a message and exit
            case "8": {
                System.out.println("Exiting...");
                System.exit(0);
            }

            //Putting a message for a failed output
            default: System.out.println("You entered an invalid input!");
        }
    }

    public static void dataConverter() {

        boolean finished = false;

        while(!finished) {
            System.out.println("Press 1 to convert a string to int, 2 to convert an int to double, 3 to convert an int to a float, 4 to convert a double to an int");
            String num = input.next();
            switch(num) {
                case "1" -> {
                    //If the user chooses "1", information is needed for the string to turn into an int
                    System.out.println("Enter the string you would like to convert to an integer: ");
                    String changeToInt = input.next();
                    System.out.println("The string changed to an integer is: " + Integer.valueOf(changeToInt));
                }
                case "2" -> {
                    //If the user chooses "2", information is needed for the int to turn into a double
                    System.out.println("Enter the int you would like to convert to a double: ");
                    int changeToDouble = input.nextInt();
                    System.out.println("The integer changed to a double is: " + (double)changeToDouble);
                }
                case "3" -> {
                    //If the user chooses "3", information is needed for the int to turn into a float
                    System.out.println("Enter the int you would like to convert to a float: ");
                    int changeToFloat = input.nextInt();
                    System.out.println("The integer changed to a float is: " + (float)changeToFloat);

                }
                case "4" -> {
                    //If the user chooses "4", information is needed for the double to turn into an int
                    System.out.println("Enter the double you would like to convert to an integer (rounded): ");
                    double roundToInt = input.nextDouble();

                    //Adds 0.5 to the double because an integer always rounds down, so if the decimal is .5 or higher, it will round to the integer above, if not, it will stay the original integer rounding down
                    roundToInt += 0.5;
                    System.out.println("The double rounded to an integer is: " + (int)roundToInt);
                }

                default -> {

                }
            }

            System.out.println("Enter 1 if you are finished, enter 2 restart the Data Converter");
            int restart = input.nextInt();
            if(restart == 1) {
                finished = true;
            }
        }

    }

    public static void gradeCalculator() {

        boolean finished = false;

        while(!finished) {
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

            System.out.println("Enter 1 if you are finished, enter 2 restart the Grade Calculator");
            int restart = input.nextInt();
            if(restart == 1) {
                finished = true;
            }
        }


    }

    public static void forLoop() {

        boolean finished = false;

        while(!finished) {

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

            System.out.println("Enter 1 if you are finished, enter 2 restart the for loop");
            int restart = input.nextInt();
            if(restart == 1) {
                finished = true;
            }
        }


    }

    public static void whileLoop() {

        boolean finished = false;

        while (!finished) {
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

                //If the guessed number is equal to the generated number, break out of the while loop;
                if (guessedNum == realNum) {
                    break;
                }
            }

            //If the guessed number is equal to the generated number, print a message saying the guessed number was correct
            if (guessedNum == realNum) {
                System.out.println("You have guessed the correct number! The number was: " + realNum);
            }

            System.out.println("Enter 1 if you are finished, enter 2 restart the whileLoop");
            int restart = input.nextInt();
            if(restart == 1) {
                finished = true;
            }
        }


    }

    public static void taxCalculator() {

        boolean finished = false;

        while(!finished) {
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
            System.out.println("Enter 1 if you are finished, enter 2 restart the taxCalculator");
            int restart = input.nextInt();
            if(restart == 1) {
                finished = true;
            }
        }


    }

    public static void arrayOrLists() {
        boolean finished = false;

        while(!finished) {

            System.out.println("Enter how many integers you want the array to have");

            //Asking the user for how many integers they want the array to have
            int maxNum = input.nextInt();

            //Creating the array using the integer given before
            int[] nums = new int[maxNum];

            //For i is equal to zero and i is less than the max number of the array, add i by one and for each integer in the array, get the user to assign a value to it
            for(int i = 0; i < maxNum; i++) {
                nums[i] = input.nextInt();
            }

            //For each part of the array, get them all, sort them, then print them sorted (Looked online for the sorting function)
            for(int i = 0; i < maxNum; i++) {
                Arrays.sort(nums);
                System.out.println(nums[i]);
            }

            //Initialize variables for the number of indices the array will have as well as the total of those elements in the indices combined
            int numOfValues = nums.length;
            int totalOfValues = 0;
            double average;

            //For statement where the total is equal to all the contents of the elements in the array added up
            for(int i = 0; i < nums.length; i++) {
                totalOfValues = nums[i] + totalOfValues;
            }

            //Double that creates the average of the array
            double arrayAverage = (double)(totalOfValues) / (double)(numOfValues);

            //Prints out the average of the array, the lowest value, and the highest value. This was easy since I was able to sort them
            System.out.println("The average of the array is: " + arrayAverage);
            System.out.println("The lowest value in the array is: " + nums[0]);
            System.out.println("The highest value in the array is: " + nums[nums.length-1]);

            System.out.println("If you are finished, press 1. If you want to restart the array, press 2");
            int restart = input.nextInt();

            if(restart == 1) {
                finished = true;
            }
        }
    }

    public static void personClass() {
        ;

        boolean finished = false;

        //Getting the name of the person
        System.out.println("Enter the person's first and last name: ");
        input.nextLine();
        String name = input.nextLine();

        //Getting the favourite quote of the person
        System.out.println("Enter the person's favourite quote: ");
        String favQuote = input.nextLine();

        //Getting the age of the person
        System.out.println("Enter the person's age: ");
        int age = input.nextInt();
        input.nextLine();

        //Adding the person object into the class and returning the information back
        Person person = new Person(age, name, favQuote);
        person.getAll();

        while (!finished) {
            //Ask the user if they want to change or get any info
            System.out.println("If you would like to change or get something, input 1, if you are finished with the person class, input 2");
            int changeOrSet = input.nextInt();

            //If the user presses 1, they would like to get or change info
            if (changeOrSet == 1) {

                //Asking the user if they want to either get or set something
                System.out.println("Enter 1 if you would like to get something, enter 2 if you would like to set something");
                int getOrSet = input.nextInt();

                //If they choose 1, they want to get something, therefore I am asking which part they want to get
                if (getOrSet == 1) {
                    System.out.println("If you would like to get age, enter 1. If you would like to get the name, enter 2, if you would like to get the quote, enter 3, and if you would like to get all of these, enter 4");
                    int ageNameOrQuote = input.nextInt();

                    //If they choose 1, get the person's age
                    if (ageNameOrQuote == 1) {
                        person.getAge();
                    }

                    //Otherwise if they choose 2, get the person's name
                    else if (ageNameOrQuote == 2) {
                        person.getName();
                    }

                    //Otherwise if they choose 3, get the person's favourite quote
                    else if (ageNameOrQuote == 3) {
                        person.getFavQuote();
                    }

                    //Otherwise if they chose 4, get all information
                    else if(ageNameOrQuote == 4) {
                        person.getAll();
                    }
                }

                //If they choose 2, ask them what they want to set
                if (getOrSet == 2) {
                    System.out.println("If you would like to set age, enter 1. If you would like to set the name, enter 2, if you would like to set the quote, enter 3");
                    int setAgeNameQuote = input.nextInt();

                    //If they choose 1, ask them to set the person's age
                    if (setAgeNameQuote == 1) {
                        person.setAge();
                        person.getAll();
                    }

                    //If they choose 2, ask them to set the person's name
                    else if (setAgeNameQuote == 2) {
                        person.setName();
                        person.getAll();
                    }

                    //If they choose 3, ask them to set the person's favourite quote
                    else if (setAgeNameQuote == 3) {
                        person.setFavQuote();
                        person.getAll();
                    }
                }
            }


            //Otherwise, if they choose 2, tell them that no changes were made and print out all the information given
            else if (changeOrSet == 2) {
                System.out.println("No changes made, final person: ");
                person.getAll();
                finished = true;
            }
        }
    }
}
