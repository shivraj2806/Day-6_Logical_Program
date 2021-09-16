package com.Bridgelabz;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find Fibonacci Series:: ");
        int upToSum = sc.nextInt();
        fibonacciSeries(upToSum);

    }

    public static void fibonacciSeries(int upToSum) {

        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber;
        if (upToSum == 1) {
            System.out.println(firstNumber);

        } else {
            System.out.println(firstNumber);
            System.out.println(secondNumber);

            for (int i = 2; i < upToSum; i++) {
                thirdNumber = firstNumber + secondNumber;
                System.out.println(thirdNumber);

                firstNumber = secondNumber;
                secondNumber = thirdNumber;
            }
        }
    }
}