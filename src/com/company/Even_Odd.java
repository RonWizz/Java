//Write a program to print whether a number is even or odd, also take
//        input.
package com.company;
import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the No  : ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        }
        else {
            System.out.println(num + " is Odd");
        }
    }
}


