
package com.Multan_Board_Percentage_Calculator;

import java.util.Scanner;

public class Percentage_Calculator {
    public static void main(String[] args) {


        String str = "password";
        Scanner sc = new Scanner(System.in);
        str = password

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the percentage Calculator in Multan Board");

        System.out.println("Enter your Subject 1 Marks");
      int s1 = input.nextInt();

        System.out.println("Enter your Subject 2 Marks");
        int  s2 = input.nextInt();

        System.out.println("Enter your Subject 3 Marks");
        int s3 = input.nextInt();

        System.out.println("Enter your Subject 4 Marks");
        int s4 = input.nextInt();

        System.out.println("Enter your Subject 5 Marks");
        int s5 = input.nextInt();

        System.out.println("Enter your Subject 6 Marks");
        int s6 = input.nextInt();

        System.out.println("Enter your Subject 7 Marks");
        int s7 = input.nextInt();

        System.out.println("Enter your Subject 8 Marks");
        int s8 = input.nextInt();

        float Percentage = ((s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8) / 800.0f *100);

        System.out.println("Your result is: " + Percentage + " Percentage");




    }
}
