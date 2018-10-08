package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1. Print 1-10
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }

        //2. Print 1-10 backwards
//        for (int i = 10; i>=1; i--) {
//            System.out.println(i);
//        }

        //3. Prints odd from 1-20
//        for (int i=1; i<=20; i++) {
//            if (i%2==1) {
//                System.out.println(i);
//            }
//        }


        //4. Prints even from 1-20
//        for (int i=1; i<=20; i++){
//            if (i%2==0) {
//                System.out.println(i);

//        for (int i = 1; i<=200; i++){
//            int total= i++;
//            System.out.println(i);
//            }
//        }

        //5. User input a number; print all numbers from input value to 1
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter a number");
//        int num = input.nextInt();
//        for (int i = num; i>=1; i--){
//            System.out.println(i);
//        }

        //6. Sum all values from 1-10
//        int sum = 0;
//        for (int i = 1; i<=10; i++) {
//            sum += i;
//        }
//            System.out.println("The sum is " + sum);

        //7. Have the user enter a number and print su of all numbers from inputted value to 1.
//        int sum = 0;
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter any number");
//        int num = input.nextInt();
//
//        for (int i = num; i >- 1; i--) {
//            sum += i;
//        }
//        System.out.println("The sum is " + sum);

        //8. Write loops to print
        //i.
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        //ii.
//        for (int i = 1; i<=6; i++) {
//            for (int j = 1; j< i; j++){
//                System.out.print("*");
//            }
//            System.out.println("");

        //ii.b..Reverse on X-axis
//        for (int i =6; i>=1; i--){
//            for (int j = 1; j<i; j++) {
//                System.out.print("*");
//            }
//                System.out.println("");
//        }

        ///iii.
//
//        for (int i = 1; i < 6; i++) {
//            for (int j = 6; j > 0; j--) {
//                if(j > i){
//                    System.out.print(" ");
//                }else{
//                    System.out.print("*");
//                }
//            }
//            System.out.println();

        //iii.b. Reverse on X-axis
//        for (int i = 5; i > 0; i--) {
//            for (int j = 5; j > 0; j--) {
//                if (j > i){
//                    System.out.print("");
//                }else{
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }

        //9. Guessing Game
//        Scanner kbd= new Scanner (System.in);
//
//        int guess =6;
//        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
//
//        for (int i=1; i<=10; i++){
//            int num = kbd.nextInt();
//
//            System.out.println("Your guess: " + num);
//
//            if (num == guess){
//                System.out.println("That's right! You're a good guesser.");
//            } else {
//                System.out.println("That is incorrect. Guess again.");
//            }
//        }

        //10. Factorial of a Number
//        Scanner input = new Scanner(System.in);
//        int value = 1;
//
//        System.out.println("Enter any number");
//        int num = input.nextInt();
//
//        for (int i = 1; i <= num; i++) {
//            System.out.println(num +"!:" + (num * (num - i))); //my method incorrect



        //The correct method!
//        Scanner input = new Scanner(System.in);
//        int value = 1;
//
//        System.out.println("Enter any number");
//        int num = input.nextInt();
//
//        for (int i = 1; i <= num; i++) {
//            value = value * i;
//        }
//        System.out.println("The factorial of " + num + " is " + value);


        //11. Fizz Buzz
        Scanner input = new Scanner (System.in);

        for (int i = 1; i<=100; i++){
            if (i%15==0){
                System.out.println("FizzBuzz");
            }else if (i%5==0) {
                System.out.println("Buzz");
            }else if(i%3==0) {
                System.out.println("Fizz");
            }else
            System.out.println(i);
        }

        }
    }
