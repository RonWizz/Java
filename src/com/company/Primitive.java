package com.company;

import java.util.Scanner;

public class Primitive {
    public static void main(String[] args) {

//        int rollno = 12;
//        char letter = 'r';
//        float marks = 98.99f;
//        double longestDeciInt = 9899932.1313;
//        long integerNo = 223428340382L;
//        boolean Check = true;
        Scanner input = new Scanner(System.in);
//        String name = input.next();
//        System.out.println(name);
        System.out.println("Enter some float value :");
        float marks = input.nextFloat();  // float no always make big float no.s in rounded form. Called floating error.
        System.out.println(marks);  // If u put an integer it will convert it into float, eg: I/N 10... O/P 10.0. Called Casting.
    }
}
