package com.programs;

import java.util.Scanner;
// Program to illustrate if else condition. Error is not handled in the current code.
public class ifElse {
    public static void main(String[] args) {
        System.out.println("Enter any number : ");
        Scanner in = new Scanner(System.in);
        int ch = Integer.parseInt(in.nextLine());

        if(ch % 2 == 0)
            System.out.println("The number is even.");
        else
            System.out.println("The number is odd. ");

        return;
    }
}
