package com.JavaFolder;

import java.util.Scanner;

public class Day3Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        if (n > 0)
            System.out.println("The entered number is a positive number");
        else if (n == 0)
            System.out.println("The entered number is zero");
        else
            System.out.println("The entered number is a negative number");
        System.out.println("Program Ended");
    }
}
