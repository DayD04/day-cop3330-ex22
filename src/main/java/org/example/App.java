package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 David Day
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print( "Enter the first number: " );
        int first = input.nextInt();

        System.out.print("Enter the second number: ");
        int second = input.nextInt();

        System.out.print("Enter the third number: ");
        int third = input.nextInt();

        if (first == second || first == third || second == third) {
            System.out.println("Two of the numbers are the same. Try again.");
        }
        else {
            int largest = 0;
            if (first > second && first > third) {
                largest = first;
            }
            if (first < second && second > third) {
                largest = second;
            }
            if (third > first && third > second) {
                largest = third;
            }

            System.out.println("The largest number is " + largest + ".");
        }
    }
}
