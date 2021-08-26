package com.Recursion.Factorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int number;

        System.out.print("Enter number that you want to find Factorial: ");
        number = scn.nextInt();

        facto facto = new facto(number);
        sampleClass smpl = new sampleClass();

        System.out.println();

        facto.Message();

        System.out.println();

        smpl.getText();
    }
}
