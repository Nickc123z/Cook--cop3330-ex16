/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Nick Cook
 */


import java.util.Scanner;

public class E16 {
    public static void main(String[] args) {

        int age = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your age? ");
        age = scan.nextInt();

        if(age>=16)
            System.out.println("You are old enough to legally drive");
        else
            System.out.println("You are not old enough to legally drive");

    }
}
